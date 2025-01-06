package September.Week4.Batch.OOPS.POJO;


// A class which contains private data members, setters and getter without main method called pojo class or bean
public class SetterAndGetterPOJO {
    private int rollNo;
    private String name;

    // you have control over data and hidden also
    void setRollNo(int rollNo) {
        if (rollNo > 100) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Number should be greater than 100");
        }

    }

    void setName(String name) {
        if (name.isEmpty() || name.equals(null)) {
            System.out.println("Name can't be empty or null");
        } else {
            this.name = name;
        }
    }

    void getRollNo() {
        System.out.println(this.rollNo);
    }

    void getName() {
        System.out.println(this.name);
    }
}


//HW wap
