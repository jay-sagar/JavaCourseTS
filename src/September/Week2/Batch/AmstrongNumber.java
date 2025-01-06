package September.Week2.Batch;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;

        int sum = 0;

        int i = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;

            num /= 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is a armstrong number");
        } else {
            System.out.println(temp + " is not a armstrong number");
        }
    }
}
