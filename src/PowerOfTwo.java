public class PowerOfTwo {
    public static void main(String[] args) {
        int N = 64;
        System.out.println(checkIfPowerOfTwo(N));
    }

    private static boolean checkIfPowerOfTwo(int n) {
        if(n == 1) return true;
        int rem = n % 2;
        if(rem == 1) return false;
        return checkIfPowerOfTwo(n/2);
    }

}
