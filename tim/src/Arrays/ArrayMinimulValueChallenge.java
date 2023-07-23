package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinimulValueChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(readIntegers()));
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type comma delimited numbers");
        String numberList = scanner.nextLine();

        String[] stringArray = numberList.split(",");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return  intArray;
    }

    public static int findMin(int[] array){
        int minValue = array[0];
        for(int i = 0; i < array.length-1; i++){
            if (array[i+1] < array[i]){
                minValue = array[i+1];
            }
        }
        return minValue;
    }
}
