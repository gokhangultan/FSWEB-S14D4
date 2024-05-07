package org.example.model;

public class Coke extends ProductForSale{
    private String cokeInstance;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    public Coke(String type, double price, String description, String cokeInstance) {
        super(type, price, description);
        this.cokeInstance = cokeInstance;
    }
    @Override
    public void showDetails() {
        System.out.println(getDescription() + " " + getType() + " " + getPrice() + " " + cokeInstance);
    }
}
