package SortingByRecursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 0, 2, 7, 4, 8};

        int N = arr.length;

        bubbleSortRecursion(arr, N, 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortRecursion(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }

        if(r > c) {
            if(arr[c-1] > arr[c]) {
                int tmp = arr[c-1];
                arr[c-1] = arr[c];
                arr[c] = tmp;
            }
            bubbleSortRecursion(arr, r, c+1);
        } else {
            bubbleSortRecursion(arr, r-1, 1);
        }

    }

}
