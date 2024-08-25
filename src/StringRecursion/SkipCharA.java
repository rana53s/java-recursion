package StringRecursion;

public class SkipCharA {
    public static void main(String[] args) {
        String str = "acbacdah";
//        String res = skipAWithParams(str, "", 0);
//        skipWithAns(str, "");
        String res = skip(str);
        System.out.println(res);
    }


    static String skipAWithParams(String str, String ans, int idx) {
        if (idx == str.length()) {
            return ans;
        }

        if(str.charAt(idx) != 'a') {
            ans += str.charAt(idx);
        }
        return skipAWithParams(str, ans, idx+1);
    }

    static void skipWithAns(String str, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            skipWithAns(str.substring(1), ans);
        } else {
            skipWithAns(str.substring(1), ans + ch);
        }
    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }




}
