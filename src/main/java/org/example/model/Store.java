package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Bread("type1", 1, "description1"),
                new Chocolate("type1", 1, "description1"),
                new Coke("type1", 1, "description1"),
                new Bread("type2", 2, "description2"),
                new Chocolate("type2", 2, "description2"),
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale prod: products){
            prod.showDetails();
        }
    }
}