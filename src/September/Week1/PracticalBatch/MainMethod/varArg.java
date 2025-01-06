package September.Week1.PracticalBatch.MainMethod;

public class varArg {

    public static void m1(int... x) {
        System.out.println("Var Arg Method");
    }

    public static void main(String[] args) {
        m1();
        m1(10);
        m1(20, 30, 40);
        m1(30, 30, 10, 20, 30, 23);
    }
}
