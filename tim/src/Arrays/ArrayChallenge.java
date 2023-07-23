package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge{
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
         }

        System.out.println(Arrays.toString(array));
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
        changeOrder(array);
        System.out.println(Arrays.toString(array));


    }

    public static int[] changeOrder(int[] array){
        int temp;

        for (int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        return array;
    }
}
