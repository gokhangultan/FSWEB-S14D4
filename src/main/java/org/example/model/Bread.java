package org.example.model;

public class Bread extends ProductForSale{
    private String breadInstance;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }
    public Bread(String type, double price, String description, String breadInstance) {
        super(type, price, description);
        this.breadInstance = breadInstance;
    }
    @Override
    public void showDetails() {
        System.out.println(getDescription() + " " + getType() + " " + getPrice() + " " + breadInstance);

    }
}
