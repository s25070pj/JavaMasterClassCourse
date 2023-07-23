package Abstraction.InterfacesGameStorage;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private  int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(Integer.toString(hitPoints));
        list.add(Integer.toString(strength));
        return list;
    }



    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
