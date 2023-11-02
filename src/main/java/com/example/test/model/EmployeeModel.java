package com.example.test.model;

public class EmployeeModel {

    private int id;
    private String name;
    private String surname;
    private String midname;
    private int age;

    public EmployeeModel(){}

    public EmployeeModel(int id, String name, String surname, String midname, int age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
