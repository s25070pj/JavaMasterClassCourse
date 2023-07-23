package Oop.BillsBurgers;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(String burgerType, String drinkType, String side) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", drinkType, 1.0);
        this.side = new Item("side", drinkType, 1.0);
    }

    public MealOrder() {
        this("regular", "coke","fries");
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getBasePrice()+ burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }
}
