package Oop.SmartKitchen;

public class SmartKitchen {

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();


        smartKitchen.setKitchenState(true,true,false);
        smartKitchen.doKitchenWork();

    }
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

   public SmartKitchen(){
       brewMaster = new CoffeMaker();
       iceBox = new Refrigerator();
       dishWasher = new DishWasher();
   }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
       brewMaster.setHasWorkToDo(coffeeFlag);
       iceBox.setHasWorkToDo(fridgeFlag);
       dishWasher.setHasWorkToDo(dishWasherFlag);
    }


    public void doKitchenWork(){
       brewMaster.brewCoffe();
       iceBox.orderFood();
       dishWasher.doDishes();
    }
}
