package DesignPattern.Singleton;

public class Student implements Cloneable{
    private static Student student = null;

    private Student() {

    }

    public static synchronized Student getObj() {
        if (student == null) {
                student = new Student();
        }
            return student;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
