package September.Week3.Batch;

public class Palindrome {
    public static void main(String[] args) {
        int i = 121;
        int temp = i;

        int rev = 0;

        while (i != 0) {
            int lastDigit = i % 10;
            rev = rev * 10 + lastDigit;
            i /= 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}
