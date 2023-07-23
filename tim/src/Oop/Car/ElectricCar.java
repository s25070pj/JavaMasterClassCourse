package Oop.Car;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int cylinders;

    public ElectricCar(double avgKmPerCharge, int cylinders) {
        super("This is an Electric car");
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
    }

    public ElectricCar(){
        super("This is an Electric Oop.Car");
        this.avgKmPerCharge = 500;
        this.cylinders = 1;
    }
    @Override
    public void startEngine() {
        System.out.println("Electric engine started");
    }

    @Override
    public void drive() {
        System.out.println("Electric car started ");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine is Running");
    }
}
