package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int N = arr.length;
        for(int i=0; i < N; i++) {
            int lastIdx = N - i - 1;
            int maxItemIdx = getMaxItemIndex(arr, 0, lastIdx);
            swap(arr, lastIdx, maxItemIdx);
        }
    }

    static int getMaxItemIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
