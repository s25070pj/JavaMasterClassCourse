package bankAccount;

import bankAccount.BankAccount;

public class Tim {
    public static void main(String[] args) {

       BankAccount customer = new BankAccount(1234,1000,"Adrian", "aaa@aaa.pl", 889);
        System.out.println(customer.getBalance());
        customer.withdrawFunds(500);
        System.out.println(customer.getBalance());
        customer.deposidFunds(300);
        System.out.println(customer.getBalance());
        customer.withdrawFunds(800  );
        System.out.println(customer.getBalance());

    }

        public static void switchValue(char natoLetter){
            switch (natoLetter) {
                case 'A' -> System.out.println(natoLetter + " = Able");
                case 'B' -> System.out.println(natoLetter + " = Baker");
                case 'C' -> System.out.println(natoLetter + " = Charlie");
                case 'D' -> System.out.println(natoLetter + " = Dog");
                case 'E' -> System.out.println(natoLetter + " = Easy");
                default -> System.out.println(natoLetter + " not found");
            }

        }



}
