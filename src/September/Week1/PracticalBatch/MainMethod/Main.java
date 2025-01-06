package September.Week1.PracticalBatch.MainMethod;

public class Main {

    //1. Why main method is public?
    // JVM can access from anywhere

    //2. Why main method is static ?
    // Because there is no need to create the object of the class to call the main method
    // If main method was non-static method then JVM would need to create the instance of the class and allocate the memory
    // before calling the main method

    //3. Why main method return type is void?
    // Because JVM doesn't want anything in return from the main method

    //4. Can we change the name of main method?
    // No, JVM required "main" method to run

    //5. What is the parameter of main method?
    // String[] Args

    //6. What is args?
    // It is the variable name, and we can change the variable name

    //7. In how many ways we can write the main method?
    // public static void main(String[] args)
    // static public void main(String[] args)
    // public static void main(String []args)
    // public static void main(String args[])
    // public static void main(String... args)

    //8. Modifiers we can use in main method
    // Final, static, public, synchronized. strictfp (Used it when we want result platform independent mostly floating point, for x32bit or x64bit)
    public static void main(String[] args) {

    }
}
