package Abstraction.AbstractionChallenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public String printPricedLineItem(int quantity){
        return  quantity + " pieces of (" + type + ") and costs " + price + "$";
    }

    public abstract void showDetails();
}
