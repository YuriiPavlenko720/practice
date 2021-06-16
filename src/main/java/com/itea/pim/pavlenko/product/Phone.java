package com.itea.pim.pavlenko.product;

public class Phone extends Product{
    private String brand;
    private String model;
    private String category;
    private double price;
    private int id;

    public Phone(int id){
        this.id=id;
    }
    public Phone(int id, String brand){
        this.id=id;
        this.brand=brand;
    }
    public Phone(int id, String brand, String category){
        this.id=id;
        this.brand=brand;
        this.category=category;
    }

    public void info (){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("ID: " + id);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
