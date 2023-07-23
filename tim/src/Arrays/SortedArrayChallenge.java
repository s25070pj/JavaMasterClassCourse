package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortedArrayChallenge {

    public static void main(String[] args) {

    }




    public static int[] getIntegers(int ints){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[ints];
        for (int i = 0; i < ints; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i =0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        int[] descOrederedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            descOrederedArray[i] = array[array.length-i-1];
        }
        return descOrederedArray;
    }
}
