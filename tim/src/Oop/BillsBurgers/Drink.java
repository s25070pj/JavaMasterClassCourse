package Oop.BillsBurgers;

public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public Drink(){
        this.type = "Coke";
        this.size = "Small";
        this.price = 3;
    }
}
