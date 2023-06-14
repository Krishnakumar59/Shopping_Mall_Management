package com.singledev.shopping_mall_management;


import com.singledev.shopping_mall_management.ShopMgmt.Shop;

public interface IShopService {
    Shop addShop(Shop shop);
    Shop updateShop(Shop shop);
    Shop searchShopById(long id);
    Boolean addEmployee(Employee employee);
    Boolean updateEmployee(Employee employee);
    Boolean deleteShop(long id);
    Item addItem(Item item);
}



/*
*
*
 +addShop(Shop shop) : Shop
+updateShop(Shop shop) : Shop
+searchShopById(long id):Shop
+addEmployee(Employee employee):Boolean
+updateEmployee(Employee employee):Boolean
+deleteShop(long id):Boolean
+addltem(ltem item):ltem
*
* */
