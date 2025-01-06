package September.Week1.PracticalBatch.VariableCalling;

public class Demo {
    int num1 = 10;
    static int num2 = 20;

    public static void main(String[] args) {
        System.out.println(num2);
        System.out.println(Example.s2);

        Demo d = new Demo();
        System.out.println(d.num1);

        Example e = new Example();
        System.out.println(e.s1);
    }
}
