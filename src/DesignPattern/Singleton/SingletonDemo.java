package DesignPattern.Singleton;

// Design Pattern are the pre-owned solutions for the commonly occurring problems in the software design.
// There are 3 types of design patterns: Creational, Structural, and Behavioral.
// Singleton has only one instance of the class and provides a global point of access to the object.
public class SingletonDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = Student.getObj();
        Student s2 = Student.getObj();
        Student s3 = (Student) s1.clone();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
