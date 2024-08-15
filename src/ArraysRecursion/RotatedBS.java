package ArraysRecursion;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 1;
        int ans = findTheIndexOfTheTargetElement(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int findTheIndexOfTheTargetElement(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s)/2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[0] <= arr[mid]) {
            if (target >= arr[0] && target <= arr[mid]) {
                findTheIndexOfTheTargetElement(arr, target, s, e -1);
            } else {
                return findTheIndexOfTheTargetElement(arr, target, mid + 1, e);
            }
        }

        if (target >= arr[mid] && target <= arr[e]) {
            return findTheIndexOfTheTargetElement(arr, target, mid + 1, e);
        }

        return findTheIndexOfTheTargetElement(arr, target, s, e -1);
    }
}
