package September.Week2.Batch;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int input = scanner.nextInt();

        boolean isPrime = true;

        if (input < 0) {
            System.out.println("Invalid Number");
            return;
        }
        if (input == 1) {
            System.out.println(input + " is a prime number");
            return;
        }

        int i = 2;

        while (i <= input / 2) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");
        }
    }
}
