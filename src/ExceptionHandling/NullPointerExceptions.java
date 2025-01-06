package ExceptionHandling;

import java.util.Scanner;

// Exception handling is mainly used to handle checked exception which are not in developer's control
// and unchecked exceptions are in developer's control, he/she can correct his/her code

// finally: we used to write important code of the program. It is executed whether is handled or not
//          final block follows try or catch block.
//          IMP: if you don't handle the exception before terminating the program JVM will execute the finally block if any

public class NullPointerExceptions {
    public static void main(String[] args) {
        String str = null;
        String city = "pune";

        Scanner sc = new Scanner(System.in);

        try {
            if (str.equals(city)) {
                System.out.println("Both are equal");
            } else {
                System.out.println("Both are not equal");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
            sc.close();
        }

        // try with resources
//        try (Scanner sc = new Scanner(System.in)) {
//            if (str.equals(city)) {
//                System.out.println("Both are equal");
//            } else {
//                System.out.println("Both are not equal");
//            }
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("finally block");
//        }
    }
}
