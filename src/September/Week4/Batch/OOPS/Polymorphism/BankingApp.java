package September.Week4.Batch.OOPS.Polymorphism;

public class BankingApp {
    public static void main(String[] args) {
        RBIBank b1 = new HDFC(); // upcasting
        System.out.println("HDFC : " + b1.getROI());
        b1 = new SBI();
        System.out.println("SBI : " + b1.getROI());

        b1.interest(); // it will called the parent static method because we don't need to create a obj to call static method
        // because b1 stores in the parent reference => upcasting
        // this is also called method hidding

        HDFC b2 = new HDFC();
        b2.interest();
    }
}

// Q. Can overriding possible in same class?
// No

// Q. is method overriding possible by changing by method written type?
// Yes it is possible

// Q. can we override a static method?
// No

// Q can properties of a class get override?
// No

// access modifier of overridden method should be same or increasing order, we cannot reduce the accessibility of overidden method