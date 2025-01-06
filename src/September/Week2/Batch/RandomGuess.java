package September.Week2.Batch;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int input = scanner.nextInt();

        int random = (int) (Math.random() * 100);
        System.out.println(random);

        if (input == random) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

    }
}
