package StringRecursion;

public class SubSequence {

    public static void main(String[] args) {
        printSubSequences("abc", "");
    }

    static void printSubSequences(String str, String ans) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Take it or don't take it
        char ch = str.charAt(0);

        printSubSequences(str.substring(1), ans);
        printSubSequences(str.substring(1), ans + ch );

    }

}
