package Oop.CarpetFloorCalculator;

public class Point {
    private int x;
    private int y;


    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distanceX = Math.abs(x);
        double distanceY = Math.abs(y);
        double distanceSqrt = (Math.pow(distanceX,2) + Math.pow(distanceY,2));
        double distance = Math.sqrt(distanceSqrt);

        return distance;
    }
}
