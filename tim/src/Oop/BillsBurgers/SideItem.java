package Oop.BillsBurgers;

public class SideItem {
    private String type;
    private double price;

    public SideItem(){
        this.type = "Fries";
        this.price = 3;
    }
    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
