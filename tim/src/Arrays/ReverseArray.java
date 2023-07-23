package Arrays;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length-1-i];
        }
     }
}
