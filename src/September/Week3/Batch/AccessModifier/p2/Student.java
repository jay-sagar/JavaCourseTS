package September.Week3.Batch.AccessModifier.p2;

// private modifier is accessible within a class
public class Student {
    private int rollNo;

    Student() {
        System.out.println("Constructor called " + this.rollNo);
    }

    private void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.display();
    }
}
