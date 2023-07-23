package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {

    }
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void sortArray(int number){

        int[] arr = new int[number];
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Nieposortowana tablica: " + Arrays.toString(arr));
        quicksort(arr, 0, number-1);
        System.out.println("Posortowana tablica: " + Arrays.toString(arr));
    }




}
