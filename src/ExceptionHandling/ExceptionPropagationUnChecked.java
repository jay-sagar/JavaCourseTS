package ExceptionHandling;

// Unchecked propagation get propagation in method calling chain implicitly or by default

class A {
    static void start() {
        int max = 100;
        int avgSpeed = max / 0;
        System.out.println("Vehicle avg: " + avgSpeed);
    }
}

class B extends A {
    static void start() {
        A.start();
        System.out.println("Car");
    }
}

class C extends A {
    static void start() {
        B.start();
        System.out.println("EvCar");
    }
}

public class ExceptionPropagationUnChecked {
    public static void main(String[] args) {
        try {
            C.start();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
