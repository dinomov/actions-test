package com.example.demo;

public class Product {
    private Integer productNumber;
    private String name;
    private Integer number;

    public Product(Integer productNumber, String name, Integer number) {
        this.productNumber = productNumber;
        this.name = name;
        this.number = number;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
