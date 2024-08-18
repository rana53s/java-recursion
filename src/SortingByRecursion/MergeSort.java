package SortingByRecursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 0, 2, 7, 4, 8};

        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = (arr.length)/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeBothTheHalf(left, right);
    }

    private static int[] mergeBothTheHalf(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Loop over both the array and assign the lowest element one by one
        while (i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }
        // if size of any array is greater than the other one, need to add rest of the elements

        // if first array is greater
        while(i < first.length) {
            res[k] = first[i];
            i++;
            k++;
        }

        // if second array is greater
        while (j < second.length) {
            res[k] = second[j];
            j++;
            k++;
        }

        return res;
    }
}
