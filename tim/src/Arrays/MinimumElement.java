package Arrays;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int countOfIntegers){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[countOfIntegers];
        for (int i = 0; i < countOfIntegers; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i  = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
