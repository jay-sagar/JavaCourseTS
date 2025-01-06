package September.Week4.Batch.OOPS.DiwaliHW.StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> students;

    public Course() {
        this.students = new ArrayList<Student>();
    }

    public void displayAllStudents() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been added to this course");
    }

    public void removeStudent(String name) {

        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println( name + " has been removed from this course");
        } else {
            System.out.println("Not found!");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();


        s1.setName("Jay");
        s1.setAge(20);
        s1.setRollNo(101);

        s2.setName("Beethoven");
        s2.setAge(99);
        s2.setRollNo(102);

        s3.setName("Chopin");
        s3.setAge(42);
        s3.setRollNo(103);

        Course music = new Course();
        music.addStudent(s1);
        music.addStudent(s2);
        music.addStudent(s3);

        music.displayAllStudents();

        music.removeStudent("Jay");

        music.displayAllStudents();
    }
}
