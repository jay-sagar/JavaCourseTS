package Recursion;

public class StringReverse {
    public static void main(String[] args) {
        reverse("abcd");
        System.out.println();
        System.out.println(reverseStr("abcd"));
    }

    static void reverse(String str) {
        if (str.isEmpty()) {
            return;
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }

    static String reverseStr(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseStr(str.substring(1)) + str.charAt(0);
    }
}
