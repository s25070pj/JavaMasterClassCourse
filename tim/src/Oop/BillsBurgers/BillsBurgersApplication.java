package Oop.BillsBurgers;

public class BillsBurgersApplication {
    public static void main(String[] args) {
        Item coke  = new Item("drink","coke",1.5);
        coke.printItem();
        coke.setSize("SMALL");
        coke.printItem();

        Item avocado = new Item("Topping","avocado",1.5);
        avocado.printItem();

        Burger burger = new Burger("Regular", 5);
        burger.addToppings("BACON","CHEESE","MAYO");
        burger.printItem();
    }
}
