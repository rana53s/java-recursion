/*
    Given an integer N, return the number of steps to reduce it to zero.
*/


public class NoOfStepsToZero {
    public static void main(String[] args) {
        int N = 5467;
        int res = countSteps(N);
        System.out.println(res);
    }

    static int countSteps(int n) {
        int count = 0;
        return getNoOfSteps(n, count);
    }
    static int getNoOfSteps(int n, int count) {
        if(n == 0) {
            return count;
        }
        if(n %2 == 0) {
            return getNoOfSteps(n/2, count+1);
        } else {
            return getNoOfSteps(n-1, count+1);
        }
    }

}
