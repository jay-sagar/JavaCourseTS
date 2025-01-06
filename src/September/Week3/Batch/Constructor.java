package September.Week3.Batch;

public class Constructor {
    // it is special type of method which is used to create and initialized an object of a class
    // constructor name and class name must be same
    // constructor doesn't have any return type
    // There are two types of constructor
    // 1. default constructor
    // 2. parameterized constructor

    // it is called or invoke at the time of object creation
    // it is called a constructor because it's constructs the value at the time of object creation
    // it is not necessary to write a constructor for a class, it is because java compiler provides or create a default constructor
    // if we are not writing any type of constructor in our class
    // constructor return an object of the class by default

    int rollNo;
    String name;
    String branch;
    Constructor(int rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(101,"Jay", "IT");
        Constructor c2 = new Constructor(102, "Smith", "Finance");

        System.out.println("Roll No : " + c1.rollNo + "Name : " + c1.name + "Branch : " + c1.branch);

    }
}
