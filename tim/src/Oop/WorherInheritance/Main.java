package Oop.WorherInheritance;

public class Main {
    public static void main(String[] args) {
        Employee adrian = new Employee("Adrian", "17.12.2001", "01.01.2023");
        SalariedEmployee marek = new SalariedEmployee("Marek", "15.03.1995", " 13.05.2020",35000);
        HourlyEmployee marie = new HourlyEmployee("Marie", "19.03.2000","19.11.2022", 25);


        System.out.println(adrian);
        System.out.println(marek);
        System.out.println("Marek's Paycheck = $" + marek.collectPay());
        marek.retire();
        System.out.println("Marek's Pension check is = $" + marek.collectPay());

        System.out.println(marie);
        System.out.println("Marie's paycheck is = $" + marie.collectPay());
        marie.getDoublePay(marie.collectPay());
        System.out.println("Marie's paycheck after raise is:" + marie.getDoublePay(marie.collectPay()));

    }
}
