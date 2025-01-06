package September.Week3.Batch;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = "abba";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
