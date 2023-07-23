package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListChallenge {


    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();
        groceryList.add("tomato");
        groceryList.add("cucumber");

        listAction(groceryList);
        System.out.println(groceryList);


    }

    public static void listAction(List<String> groceryList) {


        Scanner scanner1 = new Scanner(System.in);
        boolean flag = true;
        while (flag) {


            System.out.println("Options");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.println("Enter a number for which action you want to do");
            String actionNumber = scanner1.nextLine();

            switch (Integer.parseInt(actionNumber)) {
                case 1 -> {
                    System.out.println("Now write  groceries to add");
                    String newGroceries = scanner1.nextLine();
                    groceryList.addAll(groceriesFromInput(newGroceries));
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);

                }
                case 2 -> {
                    System.out.println("Now write groceries to delete");
                    String newGroceries = scanner1.nextLine();
                    groceryList.removeAll(groceriesFromInput(newGroceries));
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);

                }
                default -> {
                    System.out.println("Bye");
                    flag = false;
                }
            }
            groceryList.sort(Comparator.naturalOrder());
            groceryList.stream().distinct().collect(Collectors.toList());
        }
    }

    public static List<String> groceriesFromInput(String items) {
        List<String> newList = List.of(items.split(","));
        return newList;

    }
}
