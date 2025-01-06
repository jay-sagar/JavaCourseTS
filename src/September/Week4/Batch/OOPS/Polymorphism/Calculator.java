package September.Week4.Batch.OOPS.Polymorphism;

// Overloading
public class Calculator {
//    void add(int a, int b) {
//        System.out.println(a + b);
//    }
//    void add(int a, int b, int c){
//        System.out.println(a + b + c);
//    }

    // Yes we can overload a static method
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
//        c1.add(30, 100);
//        c1.add(20, 32, 1);
        add(30, 100);
        add(20, 32, 1);
        System.out.println("Main 1");
    }

    public static void main(String args) {
        System.out.println("Main 2");
    }
}


// Q. can method overloading by only changing method return type?
