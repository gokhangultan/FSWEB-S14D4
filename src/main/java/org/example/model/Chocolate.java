package org.example.model;

public class Chocolate extends ProductForSale{

    private String chocolateInstance;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }
    public Chocolate(String type, double price, String description, String chocolateInstance) {
        super(type, price, description);
        this.chocolateInstance = chocolateInstance;
    }
    @Override
    public void showDetails() {
        System.out.println(getDescription() + " " + getType() + " " + getPrice() + " " + chocolateInstance);
    }
}
