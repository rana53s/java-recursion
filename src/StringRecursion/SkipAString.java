package StringRecursion;

public class SkipAString {
    public static void main(String[] args) {
        String str = "thisIsABall";
        String res = skipTheBall(str);
        System.out.println(res);
    }

     static String skipTheBall(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("Ball")) {
            return skipTheBall(str.substring(4));
        } else {
            return str.charAt(0) + skipTheBall(str.substring(1));
        }
    }
}
