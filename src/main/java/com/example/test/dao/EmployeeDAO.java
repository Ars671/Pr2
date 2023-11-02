package com.example.test.dao;

import com.example.test.model.EmployeeModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAO {

    private static int PEOPLE_COUNT;
    private List<EmployeeModel> people;
    {
        people = new ArrayList<>();

        people.add(new EmployeeModel(++PEOPLE_COUNT,"Евсенкова", "Кристина","Владиславовна",23));
        people.add(new EmployeeModel(++PEOPLE_COUNT,"Цветнов", "Марсель","Геннадьевич",30));
        people.add(new EmployeeModel(++PEOPLE_COUNT,"Степушин ", "Георгий ","Борисович",29));
        people.add(new EmployeeModel(++PEOPLE_COUNT,"Рыжов", "Арсений","Сергеевич",19));
    }

    public List<EmployeeModel> index(){

        return people;
    }

    public EmployeeModel show(int id){
        return people.stream().filter(employeeModel -> employeeModel.getId() == id).findAny().orElse(null);
    }

    public void save(EmployeeModel employee){
        employee.setId(++PEOPLE_COUNT);
        people.add(employee);
    }

    public void update(int id, EmployeeModel employeeModel){
        EmployeeModel updateEmployee = show(id);
        updateEmployee.setName(employeeModel.getName());
        updateEmployee.setAge(employeeModel.getAge());
        updateEmployee.setSurname(employeeModel.getSurname());
        updateEmployee.setMidname(employeeModel.getMidname());
    }

    public void delete(int id){
        people.removeIf(p-> p.getId() == id);
    }

}
