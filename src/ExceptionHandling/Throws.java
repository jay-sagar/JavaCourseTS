package ExceptionHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Throws keyword is used to declare the exception and it is used with method signature(name)
public class Throws {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("F:\\TechnoSignia\\untitled\\src\\ExceptionHandling\\NullPointerExceptions.java");

            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        System.out.println("Program continues...");
    }
}
