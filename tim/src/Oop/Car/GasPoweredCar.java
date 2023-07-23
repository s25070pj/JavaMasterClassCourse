package Oop.Car;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        super("This is an Gasoline Oop.Car");
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }



    public GasPoweredCar(){
        super("This is an Gasoline Oop.Car");
        this.avgKmPerLitre = 5.5;
        this.cylinders = 4;
    }

    @Override
    public void startEngine() {
        System.out.println("Gasoline engine started");
    }

    @Override
    public void drive() {
        System.out.println("Combustion car started ");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Gasoline engine is Running");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                "} " + super.toString();
    }
}
