package Oop.Printer;


public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.addToner(-10));
        printer.printPages(30);
        System.out.println(printer.pagesPrinted);
    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(){
        this(100,0,false);
    }

    public int addToner(int amountToAdd){
        if ((tonerLevel + amountToAdd) <= 100){
            tonerLevel += amountToAdd;
            System.out.println("Added " + amountToAdd + "% to toner ");
        }else {
            System.out.println("You cant add enough toner, it will spill out");
            return -1;
        }

        System.out.print("Actually Value of toner is: "); return tonerLevel;
    }

    public int printPages(int pages){
        if (duplex){
            System.out.println("Its a duplex printer");
            return pagesPrinted += pages/2;
        }else return pagesPrinted += pages;
    }
}
