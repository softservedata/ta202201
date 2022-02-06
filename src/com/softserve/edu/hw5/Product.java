package com.softserve.edu.hw5;

public class Product {
    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
}
