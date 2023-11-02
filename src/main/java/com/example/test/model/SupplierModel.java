package com.example.test.model;

public class SupplierModel {

    private int id;
    private String name;
    private int phone;
    private String address;
    private int inn;

    public SupplierModel(){}

    public SupplierModel(int id, String name, String address, int phone, int inn){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inn = inn;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}
