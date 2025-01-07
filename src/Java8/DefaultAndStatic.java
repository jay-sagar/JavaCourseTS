package Java8;

// Default methods in interfaces enable the programmer to add new methods to an interface without breaking the classes that already implement the interface.
// Static keyword is defined using static keyword, and default methods are defined using default keyword.

interface Vehicle {
    default void print() {
        System.out.println("I am a vechile!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface Engine {
    default void print() {
        System.out.println("I am an engine!");
    }

}

class Car implements Vehicle, Engine {
    public void print() {
        Vehicle.super.print();
    }
}


public class DefaultAndStatic {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.print();
    }
}
