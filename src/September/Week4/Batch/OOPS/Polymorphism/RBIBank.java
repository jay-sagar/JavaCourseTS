package September.Week4.Batch.OOPS.Polymorphism;

public class RBIBank {
    float getROI() {
        return 4.5f;
    }
    public RBIBank getBankObj() {
        return new RBIBank();
    }

    static void interest() {
        System.out.println("RBI Interest");
    }
}

class SBI extends RBIBank {
    float getROI() {
        return 10.f;
    }

    // this is allowed, Coherent
    public SBI getBankObj() {
        return new SBI();
    }

    static void interest() {
        System.out.println("SBI Interest");
    }
}

class HDFC extends RBIBank {

    float getROI() {
        return 9.5f;
    }
    public HDFC getBankObj() {
        return new HDFC();
    }

    static void interest() {
        System.out.println("HDFC Interest");
    }
}
