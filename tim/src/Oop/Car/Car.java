package Oop.Car;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public Car(){
        description = "This is a Oop.Car";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("The engine is turned on");
    }

    public void drive(){
        System.out.println("Oop.Car started ");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Engine is Running");
    }
}
