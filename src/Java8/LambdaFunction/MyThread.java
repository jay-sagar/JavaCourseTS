package Java8.LambdaFunction;

public class MyThread {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Thread is running...");

        Thread t1 = new Thread(r1);
        t1.start();
    }
}
