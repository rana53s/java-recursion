package ArraysRecursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 1};
        System.out.println(sortedArray(arr, 0));
    }

    private static boolean sortedArray(int[] arr, int i) {
        if(i == arr.length - 1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return sortedArray(arr, i+1);
    }
}
