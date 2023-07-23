package UnboxingAutoboxing.autoboxingChallenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialDeposit) {
        this.name = name.toUpperCase();
        transactions = new ArrayList<>(500);
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
