package algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void main(String[] args) {
        int[] array = generateRandomArray(1000); // Generowanie losowej tablicy o rozmiarze 1 000 000

        int[] arrayToSort = array.clone();
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        System.out.println("Quicksort czas: " + (endTime - startTime) + " ms");

        arrayToSort = array.clone();
        startTime = System.currentTimeMillis();
        countingSort(arrayToSort, arrayToSort.length);
        endTime = System.currentTimeMillis();
        System.out.println("Countingsort czas: " + (endTime - startTime) + " ms");

        arrayToSort = array.clone();
        startTime = System.currentTimeMillis();
        heapsort(arrayToSort);
        endTime = System.currentTimeMillis();
        System.out.println("Heapsort czas: " + (endTime - startTime) + " ms");
    }

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static int getMax(int[] a, int n) {
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max; //maximum element from the array
    }
    public static void countingSort(int[] a, int n) // function to perform counting sort
    {
        int[] output = new int [n+1];
        int max = getMax(a, n);
        //int max = 42;
        int[] count = new int [max+1]; //create count array with size [max+1]

        for (int i = 0; i <= max; ++i)
        {
            count[i] = 0; // Initialize count array with all zeros
        }

        for (int i = 0; i < n; i++) // Store the count of each element
        {
            count[a[i]]++;
        }

        for(int i = 1; i<=max; i++)
            count[i] += count[i-1]; //find cumulative frequency

  /* This loop will find the index of each element of the original array in

count array, and
   place the elements in output array*/
        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--; // decrease count for same numbers
        }

        for(int i = 0; i<n; i++) {
            a[i] = output[i]; //store the sorted elements into main array
        }
    }


    public static void heapsort(int[] array) {
        int n = array.length;

        // Budowanie kopca
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Sortowanie poprzez usuwanie maksymalnego elementu z kopca
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE) + 1;
        }

        return array;
    }
}
