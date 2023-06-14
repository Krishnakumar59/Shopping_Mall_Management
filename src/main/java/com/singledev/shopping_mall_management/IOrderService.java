package com.singledev.shopping_mall_management;


import org.springframework.core.annotation.Order;

public interface IOrderService {
    public Order addOrder(Order order);
    public Order updateOrder(Order order);
    public Order searchOrder(long id);
    boolean cancelOrder(long id);
    Item addItem(Item item);
}
