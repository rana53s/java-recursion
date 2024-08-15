package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 0, 2, 7, 4, 8};

        int[] arr2 = {0, 1, 2, 3, 4, 5};

//        bubbleSort(arr);

        optimizedBubbleSort(arr2);
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void optimizedBubbleSort(int[] arr) {
        boolean swapped;
        for(int i=0; i< arr.length; i++) {
            swapped = false;
            for(int j = 1; j<arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swapped = true;
                }
                if(!swapped) { // This check is for the sorted array.
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
