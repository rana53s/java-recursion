package ArraysRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 6, 8, 12};
        int target = 6;
//        System.out.println(findTheTarget(arr, target, 0));
//        System.out.println(findTheIndex(arr, target, 0));
//        ArrayList<Integer> res = findAllIndex(arr, target, 0, new ArrayList<>());
        ArrayList<Integer> res = findAllIndex2(arr, target, 0);
        System.out.println(res);
    }

    private static boolean findTheTarget(int[] arr, int t, int i) {
        if(arr[i] == t) {
            return true;
        }
        if(i == arr.length-1) {
            return false;
        }
        return findTheTarget(arr, t, i+1);
    }

    private static int findTheIndex(int[] arr, int t, int i) {
        if(arr[i] == t) {
            return i;
        }
        if(i == arr.length-1) {
            return -1;
        }
        return findTheIndex(arr, t, i+1);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx, ArrayList<Integer> list) {
        if(idx == arr.length-1) {
            return list;
        }
        if(arr[idx] == target) {
            list.add(idx);
        }
        return findAllIndex(arr, target, idx+1, list);
    }

    private static ArrayList<Integer> findAllIndex2(int[] arr, int target, int idx) {
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length-1) {
            return list;
        }
        if(arr[idx] == target) {
            list.add(idx);
        }
        ArrayList<Integer> ansFromPrevCalls =  findAllIndex2(arr, target, idx+1);
        list.addAll(ansFromPrevCalls);
        return list;
    }
}
