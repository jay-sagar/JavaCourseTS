package September.Week3.Practical;

public class IDK {
    public static void main(String[] args) {
        int n = 123;

        int sum = 0;
        int mul = 1;

        while (n != 0 ){
            int lastDigit = n % 10;
            sum += lastDigit;
            mul *= lastDigit;

            n /= 10;
        }

        if (sum == mul) {
            System.out.println("It's true");
        } else {
            System.out.println("False");
        }
    }
}
