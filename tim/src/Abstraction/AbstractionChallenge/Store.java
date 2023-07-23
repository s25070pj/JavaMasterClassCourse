package Abstraction.AbstractionChallenge;

import java.util.ArrayList;
import java.util.List;

record OrderItem(int quantity, ProductForSale productForSale){

}
public class Store {


    private static List<ProductForSale> storeProducts = new ArrayList<>();
    List<OrderItem> orders = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new Glo("Hyper X", 59, "Better taste sensations, lower heating temperature"));
        storeProducts.add(new Glo("fist", 29, "Normal glo"));
        listProducts();
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }


    public static void listProducts() {
        for (ProductForSale product : storeProducts) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.productForSale().printPricedLineItem(item.quantity());
            salesTotal += item.productForSale().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }

}