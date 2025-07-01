package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1= new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "mobile", 100000);
        Product[] products = {p1,p2};
        User user = new User(01, "Nadeem", 1);
        user.placeOrder(products);
        user.viewOrders();
    }
}