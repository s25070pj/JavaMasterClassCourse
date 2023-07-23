package Oop.Car;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar( double avgKmPerLitre, int cylinders) {
        super("This is a Hybrid Oop.Car");
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public HybridCar(){
        super("This is a Hybrid Oop.Car");
        this.avgKmPerLitre = 18.3;
        this.cylinders = 4;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine started");
    }

    @Override
    public void drive() {
        System.out.println("Hybrid car started ");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine is Running");
    }}
