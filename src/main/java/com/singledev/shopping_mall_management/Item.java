package com.singledev.shopping_mall_management;

import java.time.LocalDate;

public class Item {

    long id;
    String name;
    LocalDate manufacturing;
    LocalDate expiry;
    float price;

    public Item(long id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
        this.id = id;
        this.name = name;
        this.manufacturing = manufacturing;
        this.expiry = expiry;
        this.price = price;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(LocalDate manufacturing) {
        this.manufacturing = manufacturing;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;

}
/*
* -id : long
-name : String
-manufacturing : LocalDate
-expiry: LocalDate
-price: float
-category: String
*
* */