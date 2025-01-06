package September.Week4.Batch.OOPS.Polymorphism;


// runtime polymorphism => dynamic method dispatch
// method overriding
// In other words, dynamic method dispatch in which call of overridden in runtime
// same method with same parameter in a different class is called a method overriding
public class Car extends Vehicle{
    public void start() {
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();

        Vehicle c2 = new Car(); // upcasting
        c2.start();

        Vehicle b1 = new Bike(); // upcasting
        b1.start();
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }
}
