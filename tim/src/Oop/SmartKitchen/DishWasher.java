package Oop.SmartKitchen;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(){

    }
    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing dishes");
            hasWorkToDo = false;
        }
    }
}
