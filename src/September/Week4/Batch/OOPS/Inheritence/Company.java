package September.Week4.Batch.OOPS.Inheritence;

public class Company {
    void rules() {
        System.out.println("This is info from company");
    }

    String companyName = "TechnoSignia";
}

class Worker extends Company{
    void time() {
        System.out.println("8 Hrs of work");
    }
}


