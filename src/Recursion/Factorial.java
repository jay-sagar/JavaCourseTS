package Recursion;

// It is a process in which a method or function calls its self directly or indirectly is called a recursion
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
