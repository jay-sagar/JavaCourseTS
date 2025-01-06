package September.Week4.Batch.OOPS.Abstraction;

// 0 to 100% abstraction
// we can't instantiate(object of the class) the abstract class
public abstract class Bank {
    void display() { // non-abstract method, method definition, method implementation, method with body
        System.out.println("Bank---");
    }
    static void display1() {
        System.out.println("Bank 01 --");
    }

    // can have static abstract
    abstract float getROI(); // abstract method, unimplemented method, method without body, method declaration
}

class SBI extends Bank {
    // you have to override the abstract method, it is compulsory
    float getROI() {
        return 4.5f;
    }
}

class ICICI extends Bank {

    float getROI() {
        return 5.6f;
    }
}