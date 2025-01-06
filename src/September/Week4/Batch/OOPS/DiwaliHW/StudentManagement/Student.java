package September.Week4.Batch.OOPS.DiwaliHW.StudentManagement;

public class Student {
    private String name;
    private int age;
    private int rollNo;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
//        System.out.println("Name added: " + name);
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
//        System.out.println("Age added: " + age);
    }

    public int getAge() {
        return this.age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
//        System.out.println("RollNo added: " + rollNo);
    }

    public int getRollNo() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", RollNo: " + this.rollNo;
    }
}
