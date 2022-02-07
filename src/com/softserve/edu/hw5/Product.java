package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {
    private String productName;
    private int productPrice;

    public Product () {
        this.productName = "";
        this.productPrice = 0;
    }
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

    @Override
    public String toString() {
        return "\nProduct " + productName + " at " + productPrice;
    }
///*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
            Product other = (Product) o;
            if ((productPrice != other.productPrice)
                    || ((productName == null) && (other.productName != null))
                    || ((productName != null) && (other.productName == null))) {
                return false;
            }
            if ((productName == null) && (other.productName == null)) {
                return true;
                return other.equals(other.productName);
                //return productPrice == product.productPrice && Objects.equals(productName, product.productName);
            }
        }
    }

// */
/*
    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }
 */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + productPrice;
            result = prime * result + ((productName == null) ? 0 : productName.hashCode());
            return result;
        }
    }
