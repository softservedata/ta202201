package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {

    private String productName;
    private int price;

    //constructor receives variables which is passed from creating object/instance
    public Product(String productName, int price) {
        this.setProductName(productName);
        this.setPrice(price);
    }

    public String getProductName() {
        return "Yura's " + this.productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price - 10;
    }

    @Override
    public String toString() {
        return "Product name: '" + this.getProductName() + '\'' +
                ", Price with discount: " + this.getPrice();
    }

    @Override
    public boolean equals(Object somethingToCompare){
        if (this == somethingToCompare) {
            return false;
        }

        if (somethingToCompare == null) {
            return false;
        }

        // class Type leads to the current class(name)
        Object thisClassType = this.getClass();
        Object typeSomethingToCompare = somethingToCompare.getClass();
        if (thisClassType != typeSomethingToCompare) {
            return false;
        }

        //somethingToCompare is converting to type = Product
        Product productToCompare = (Product) somethingToCompare;

        boolean isNameSame = Objects.equals(this.getProductName(), productToCompare.getProductName());
        boolean isPriceSame = this.getPrice() == productToCompare.getPrice();
        if (isNameSame && isPriceSame) {
            return true;
        } else {
            return false;
        }
    }
}
