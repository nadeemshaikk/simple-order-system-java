package org.example;

public class Product {
       int productId;
       String name;
       double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductDetails(){
        System.out.println("\tproductID: " + productId + ",Name: " + name +",Price: "+ price);
    }
}
