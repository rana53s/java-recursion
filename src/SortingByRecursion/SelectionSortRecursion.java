package SortingByRecursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 0, 2, 7, 4, 8};

        int N = arr.length;

//        selectionSortRecursion(arr, N, 0);

        selectionSortRecursion2(arr, N, 0, 0);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortRecursion(int[] arr, int n, int i) {
        if(i == n) return;
        int lastIdx = n - i - 1;
        int maxEleIdx = getMaxEleIdx(arr, 0, lastIdx);
        swapPosition(arr, lastIdx, maxEleIdx);
        selectionSortRecursion(arr, n, i+1);
    }

    static void swapPosition(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getMaxEleIdx(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void selectionSortRecursion2(int[] arr, int n, int i, int max) {
        if(n == 0) return;

        if(i < n) {
            if(arr[i] > arr[max]) {
                selectionSortRecursion2(arr, n, i+1, i);
            } else {
                selectionSortRecursion2(arr, n, i+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[n-1];
            arr[n-1] = temp;
            selectionSortRecursion2(arr, n-1, 0, 0);
        }
    }


}
