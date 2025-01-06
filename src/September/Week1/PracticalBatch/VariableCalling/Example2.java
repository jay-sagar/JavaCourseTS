package September.Week1.PracticalBatch.VariableCalling;

public class Example2 {
    char grade = 'A';
    static long mobileNumber = 8888888888l;

    public static void main(String[] args) {
        // static variable

        System.out.println(mobileNumber);
        System.out.println(Example1.salary);

        // non static variable

        Example2 ex2 = new Example2();
        System.out.println(ex2.grade);

        Example1 ex1 = new Example1();
        System.out.println(ex1.marks);
    }
}
