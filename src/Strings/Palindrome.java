package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        String newStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        if (str.equals(newStr)) System.out.println(str + " is a palindrome");
        else System.out.println(str + " is not a palindrome");
    }
}
