package Abstraction.InterfacesMapping;

enum Geometry{LINE, POINT, POLYGON}

enum Color{BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker{CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker{DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties" :{%s} """;

    String getLabel(); //how the item should be described on the map
    Geometry getShape(); //POINT or LINE
    String getMarker(); //map marker


    default String toJSON(){

        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){

        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

}
