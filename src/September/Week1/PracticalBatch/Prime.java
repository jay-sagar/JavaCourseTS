package September.Week1.PracticalBatch;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int input = scanner.nextInt();

        whileLoop(input);
        forLoop(input);
    }

    public static void whileLoop(int input) {
        if (input == 1 || input == 0) {
            System.out.println(input + " is a Prime Number");
            return;
        }

        int i = 2;
        while (i < input) {
            if (input % i == 0) {
                System.out.println(input + " is not a Prime Number");
                return;
            }
            i++;
        }
        System.out.println("It's a prime number");
    }

    public static void forLoop(int input) {
        if (input == 1 || input == 0) {
            System.out.println(input + " is not a prime number");
        } else {
            int count = 0;
            for (int i = 2; i < input; i++) {
                if (input % i == 0) count++;
            }
            if (count > 0) {
                System.out.println(input + " is not a prime number");
            } else {
                System.out.println(input + " is a prime number");
            }
        }
    }
}
