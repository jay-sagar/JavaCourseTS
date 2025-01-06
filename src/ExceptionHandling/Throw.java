package ExceptionHandling;


//Throws:
//Used in a method signature to declare that the method might throw a checked exception.
//It informs the caller of the method that they need to handle the potential exception.

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ageLimiter(17);
    }

    static void ageLimiter(int age) {
        if (age < 18) {
            throw new CustomException("You are underage to cast a vote");
        } else {
            System.out.println("You can vote");
        }
    }
}
