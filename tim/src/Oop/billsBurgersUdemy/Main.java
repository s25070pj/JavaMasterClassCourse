package Oop.billsBurgersUdemy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] hey = new int[]{1,2,3,4,5};
        int[] hello = Arrays.copyOf(hey,hey.length);

        hey[0] = 5;

        System.out.println(Arrays.toString(hey));
        System.out.println(Arrays.toString(hello));
    }
}
