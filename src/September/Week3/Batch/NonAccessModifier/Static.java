package September.Week3.Batch.NonAccessModifier;

public class Static {
    // Static is a keyword and a non access modifier which is used with class, variable, method, and static block
    // It doesn't store in heap area but in class area

    // if you declare any variable as a static, the single copy of static variable is created and shared among all the object
    // you can call the static variable as class name

    int rollNo; // properties, global variable, instance variable, field

    String name;

    static String collegeName = "Technosignia";
    static String countryName;


    // static block is used to initialized static data members and static block will execute before main method
    static {
        collegeName = "India";
        System.out.println("Static block 0");
    }
    static {
        collegeName = "India";
        System.out.println("Static block 1");
    }

    static {
        collegeName = "India";
        System.out.println("Static block 2");
    }

    static {
        collegeName = "India";
        System.out.println("Static block 3");
    }

    // all the static will execute from top to bottom

    // if you declare any method as static then it is called a static method
    //  can be called without using object of the class

    // why can't we declare each and every method as static in java?
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        add(10, 20);
    }
}
