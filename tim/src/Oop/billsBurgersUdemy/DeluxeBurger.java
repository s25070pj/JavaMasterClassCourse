package Oop.billsBurgersUdemy;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("DeluxeBurger","beef", 19.10,"shortBread");
        addHamburgerAddition1("chips", 0);
        addHamburgerAddition2("drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {

    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    }
}
