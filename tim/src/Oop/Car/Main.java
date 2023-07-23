package Oop.Car;

public class Main {
    public static void main(String[] args) {
        Car gasolineCar = new GasPoweredCar();
        gasolineCar.runEngine();
        System.out.println(gasolineCar.getDescription());

        Car car = new Car();
        System.out.println(car.getDescription());

        Object someCar = new GasPoweredCar();

        if (someCar instanceof GasPoweredCar gass){
            System.out.println(gass.getDescription());
        }
        System.out.println("");
        runRace(gasolineCar);


    }

    public static void runRace(Car car){
        System.out.println(car.getClass().getSimpleName());
        car.startEngine();
        car.drive();
    }
}
