package SolidPrinciple;

// Subclass must be substituted for their base types (parent class) without alternating the correctness of the program
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Penguin p1 = new Penguin();
        p1.eat();
    }
}

class Bird {
    public void eat() {
        System.out.println("Bird eats");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats");
    }
}

class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Penguin eats");
    }
}
