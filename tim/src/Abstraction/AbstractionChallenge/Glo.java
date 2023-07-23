package Abstraction.AbstractionChallenge;

public class Glo extends ProductForSale{

    public Glo(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " is great tomacco heater, the price is: " + price);
    }
}
