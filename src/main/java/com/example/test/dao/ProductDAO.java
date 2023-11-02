package com.example.test.dao;

import com.example.test.model.ProductModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAO {

    private static int PRODUCT_COUNT;
    private List<ProductModel> product;
    {
        product = new ArrayList<>();

        product.add(new ProductModel(++PRODUCT_COUNT,"iPhone 15",159000, "Pro Max",902355));
        product.add(new ProductModel(++PRODUCT_COUNT,"Sony PlayStation 5",87956, "С дисководом",345678));
        product.add(new ProductModel(++PRODUCT_COUNT,"Tecno Camon",19000, "Pro 8",987623));
        product.add(new ProductModel(++PRODUCT_COUNT,"INOI A62",2816, "Lite 2",562346));
    }

    public List<ProductModel> index(){

        return product;
    }

    public ProductModel show(int id){
        return product.stream().filter(productModel -> productModel.getId() == id).findAny().orElse(null);
    }

    public void save(ProductModel person){
        person.setId(++PRODUCT_COUNT);
        product.add(person);
    }

    public void update(int id, ProductModel productModel){
        ProductModel updateProduct = show(id);
        updateProduct.setArticle(productModel.getArticle());
        updateProduct.setName(productModel.getName());
        updateProduct.setPrice(productModel.getPrice());
        updateProduct.setType(productModel.getType());
    }


    public void delete(int id){
        product.removeIf(p-> p.getId() == id);
    }

}
