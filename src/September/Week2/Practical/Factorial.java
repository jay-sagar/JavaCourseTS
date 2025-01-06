package September.Week2.Practical;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int input = scanner.nextInt();

        int prod = 1;

        for (int i = 1; i <= input; i++) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}
