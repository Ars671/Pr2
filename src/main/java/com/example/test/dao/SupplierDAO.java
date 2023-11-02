package com.example.test.dao;

import com.example.test.model.SupplierModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SupplierDAO {

    private static int SUPPLIER_COUNT;
    private List<SupplierModel> supplier;
    {
        supplier = new ArrayList<>();

        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"Sony", "Белгородская область, город Егорьевск, ул. Славы, 04",01,864728595));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"Tecno", "Магаданская область, город Можайск, проезд Домодедовская, 26",02,743859482));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"Netemumb", "Ленинградская область, город Люберцы, бульвар Домодедовская, 92",03,35977257));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"Hohiot", "Самарская область, город Москва, въезд 1905 года, 84",04,128563860));
    }

    public List<SupplierModel> index(){

        return supplier;
    }

    public SupplierModel show(int id){
        return supplier.stream().filter(supplierModel -> supplierModel.getId() == id).findAny().orElse(null);
    }

    public void save(SupplierModel person){
        person.setId(++SUPPLIER_COUNT);
        supplier.add(person);
    }

    public void update(int id, SupplierModel supplierModel){
        SupplierModel updateSupplier = show(id);
        updateSupplier.setPhone(supplierModel.getPhone());
        updateSupplier.setName(supplierModel.getName());
        updateSupplier.setAddress(supplierModel.getAddress());
        updateSupplier.setInn(supplierModel.getInn());
    }


    public void delete(int id){
        supplier.removeIf(p-> p.getId() == id);
    }

}
