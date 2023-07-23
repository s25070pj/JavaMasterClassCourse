package UnboxingAutoboxing.autoboxingChallenge;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>(5000);


    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.printf("New customer (%s) with %d deposit %n ", customerName, initialDeposit);
        }

    }

    public Customer getCustomer(String customerName){
        if (!customerName.isBlank()){
            for (var c : customers){
                if (c != null && c.getName().equalsIgnoreCase(customerName)){
                    return c;
                }
            }
        }
        System.out.printf("Customer (%s) wasnt found %n", customerName);
        return null;
    }



}
