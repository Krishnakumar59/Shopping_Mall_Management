package com.singledev.shopping_mall_management;

import com.singledev.shopping_mall_management.ShopMgmt.Shop;

import java.time.LocalDate;

public class ShopOwner {
    int id;
    String name;
    LocalDate dob;
    String address;
    Shop shop_id;

    public ShopOwner(int id, String name, LocalDate dob, String address, Shop shop_id) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.shop_id = shop_id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Shop getShop_id() {
        return shop_id;
    }

    public void setShop_id(Shop shop_id) {
        this.shop_id = shop_id;
    }
}


/*
*
* -id : int
-name : String
-dob : LocalDate
-address: String
-shop_id: Shop
* */