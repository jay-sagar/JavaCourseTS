package September.Week4.Batch.OOPS.ProtectedAccessModifier.p2;

import September.Week4.Batch.OOPS.ProtectedAccessModifier.p1.Person;

// can't have upcasting on this
public class Student extends Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getPersonName());
    }
}
