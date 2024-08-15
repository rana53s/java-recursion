package PatternRecursion;

public class TrianglePattern {
    public static void main(String[] args) {
        /*
            *   *   *   *
            *   *   *
            *   *
            *
        */
       // printTriangle(4, 0);

        /*
            *
            *   *
            *   *   *
            *   *   *   *
        */
        printTriangle2(4, 0);

    }

    static void printTriangle(int r, int c) {
        if(r == 0) return;

        if(c < r) {
            System.out.print("*   ");
            printTriangle(r, c+1);
        } else {
            System.out.println();
            printTriangle(r-1, 0);
        }
    }

    static void printTriangle2(int r, int c) {
        if(r == 0) return;

        if(c < r) {
            printTriangle2(r, c+1);
            System.out.print("*   ");
        } else {
            printTriangle2(r-1, 0);
            System.out.println();
        }
    }
}
