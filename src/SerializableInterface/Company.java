package SerializableInterface;

import java.io.*;

// transient -> it will not included in serialization ( even when sending to databases )
class Employee implements Serializable {
    private long id;
    private String name;
    private transient int salary;

    public Employee(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Company {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee(1, "John", 10000);
        String fileName = "employee.ser";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

        oos.writeObject(e1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

        Employee deserializeObj = (Employee) ois.readObject();
        System.out.println(deserializeObj.toString());
    }
}
