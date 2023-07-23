package Abstraction.InterfacesMapping;

public class UtilityLine implements Mappable{

    private String name;
    private UsageType usage;

    @Override
    public String getLabel() {
        return name + " " + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return null;
    }
}
