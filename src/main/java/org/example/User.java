package org.example;

import java.util.ArrayList;

public class User {
    int userId;
    String name;
    Order[] orders;
    int orderCount;

    public User(int userId, String name ,int maxOrders){
        this.userId = userId;
        this.name = name;
        this.orders = new Order[maxOrders];
        this.orderCount = 0;

    }
    public void placeOrder(Product[] products){
        if(orderCount<orders.length){
            Order newOrder = new Order(orderCount+1, products);
            orders[orderCount++] = newOrder;
        }


    }
    public void viewOrders(){
        System.out.println("Orders placed Successfully");
        System.out.println("Orders for "+ name);
        for(Order order: orders){
            order.displayOrderDetails();
        }
        System.out.println();
    }
}
