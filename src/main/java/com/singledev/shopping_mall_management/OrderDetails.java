package com.singledev.shopping_mall_management;

import com.singledev.shopping_mall_management.ShopMgmt.Shop;

import java.time.LocalDateTime;

public class OrderDetails {

    int id;
    LocalDateTime dateOfPurchase;
    float total;
    Customer customer_id;
    String paymentMode;
    Shop shop_id;
}

/*
* -id : int
-dateOfPurchase: LocalDateTime
-total: float
-customer id: Customer
-paymentMode: String
-shop_id: Shop
* */