package September.Week4.Batch.OOPS.FinalExample;

//we can't extend final class
//public final class Calculator {
//    void add(int a, int b) {
//        System.out.println(a + b);
//    }
//}

// we can't extends it
//class App extends Calculator {
//
//}

public class Calculator {
    final float p1 = 3.14f; // constant

    final void add(int a, int b) {
//        p1 = 3.15f; // compile time error
        System.out.println(a + b);
    }
}

class App extends Calculator {

    public static void main(String[] args) {
        App a1 = new App();
        a1.add(12, 40); // inherite
    }
}