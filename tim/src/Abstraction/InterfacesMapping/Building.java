package Abstraction.InterfacesMapping;


enum UsageType{ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}
public class Building implements Mappable{

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " " + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.PUSH_PIN;
            case RESIDENTIAL -> Color.BLACK + " " + PointMarker.STAR;
            case SPORTS -> Color.ORANGE + " " + PointMarker.CIRCLE;
            default -> Color.BLUE + " " + PointMarker.SQUARE;
        };
    }
}
