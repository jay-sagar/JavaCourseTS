package September.Week4.Batch.OOPS.Inheritence;

public class Employees extends Company{
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        System.out.println(emp1.companyName);
        emp1.rules();

        Worker w1 = new Worker();
        w1.time();
        w1.rules();
        System.out.println(w1.companyName);
    }
}

