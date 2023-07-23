package Lists.LinkedListChallengePlacesToVisit;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    public static void main(String[] args) {

        LinkedList<Place> placeList = new LinkedList<>();
        addPlace(placeList, new Place("Sydney", 0));
        addPlace(placeList, new Place("Adelaide", 1374));
        addPlace(placeList, new Place("Alice Springs", 2771));
        addPlace(placeList, new Place("Brisbane", 917));
        addPlace(placeList, new Place("Darwin", 3972));
        addPlace(placeList, new Place("Melboune", 877));
        addPlace(placeList, new Place("Perth", 3923));
        addPlace(placeList, new Place("Perth", 3923));
        addPlace(placeList, new Place("perth", 3923));
        placeList.addLast(new Place("Sydney", 5));
        getAction(placeList);
    }

    private static void displayMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)it
                """);
    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.stream().anyMatch(p -> p.getPlace().equalsIgnoreCase(place.getPlace()))) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        int matchedIndex = 0;
        for (Place listPlace : list) {
            if (place.getKmFromSydney() < listPlace.getKmFromSydney()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }


    public static void getAction(LinkedList<Place> placeList){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Place> iterator = placeList.listIterator();


        boolean flag = true;
        displayMenu();
        while (flag) {

            char action = scanner.next().charAt(0);
            switch (action) {
                case 'F', 'f' -> {

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }else System.out.println("It was the last place");
                }
                case 'B', 'b' -> {
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }else System.out.println("It was the first place");
                }
                case 'L', 'l' -> {
                    System.out.println(placeList.toString());

                }
                case 'M', 'm' -> {
                    displayMenu();
                }
                case 'Q', 'q' -> {
                    flag = false;
                }
            }
        }
    }
}
