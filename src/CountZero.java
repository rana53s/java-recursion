public class CountZero {
    public static void main(String[] args) {
        int res = countZero(304000, 0);
        System.out.println(res);
    }

    static int countZero(int n, int c) {
        if(n == 0) {
            return c;
        }

        if(n % 10 == 0) {
            return countZero(n/10, c+1);
        } else {
            return countZero(n/10, c);
        }

    }
}
