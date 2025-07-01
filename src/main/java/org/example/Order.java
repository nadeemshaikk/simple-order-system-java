package org.example;

public class Order {
    int orderId;
    Product[] products;
    double totalAmount;

    public Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;

    }
    public double calculateTotal(){

        for(Product p : products){
            totalAmount += p.getPrice();
        }return totalAmount;
    };

    public void displayOrderDetails(){
        System.out.println("Order Id " + orderId);
        for(Product p: products){
            p.displayProductDetails();
        }
        calculateTotal();
        System.out.println("\tTotal Amount: "+ totalAmount);
    }
}
