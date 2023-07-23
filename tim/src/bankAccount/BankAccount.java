package bankAccount;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposidFunds(double balance){
        this.balance += balance;
    }

    public void withdrawFunds(double balance){
        if (this.balance >= balance){
            this.balance -= balance;
        }else{
            System.out.println("You dont have too much money on account");
        }
    }
}
