package com.example.test.model;

public class ProductModel {

    private int id;
    private String name;
    private int price;
    private String type;
    private int article;

    public ProductModel(){}

    public ProductModel(int id, String name, int price, String type, int article){
        this.id = id;
        this.article = article;
        this.price = price;
        this.type = type;
        this.name = name;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }
}
