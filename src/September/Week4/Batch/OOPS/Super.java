package September.Week4.Batch.OOPS;

// this() => current class constructor
// super() => parent class constructor

// this() and super() is used to call current class constructor and parent class constructor respectively.
// this or super must be the first statement of constructor
// super() is first constructor of any constructor implicitly by default
// we can't write super and this at the same time

class A {
    A() {
        // super() => it is default
        System.out.println("A");
    }
}

class B extends A {
    B() {
        // super() => it is default
        System.out.println("B");
    }

    B(String a) {
        System.out.println("A");
    }
}

class C extends B {
    C() {
        // super() => it is default
        this(10);
        System.out.println("C");
    }

    C(int a) {
        super("A");
        System.out.println("C: " + a);
    }
}

public class Super {
    public static void main(String[] args) {
        C c1 = new C();
    }
}
