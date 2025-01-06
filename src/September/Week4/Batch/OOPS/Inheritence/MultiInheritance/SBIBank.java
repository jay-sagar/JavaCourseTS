package September.Week4.Batch.OOPS.Inheritence.MultiInheritance;

//Final is a keyword
public class SBIBank implements Bank, RBIBank{
    public float getROI() {
        return 7.5f;
    }

    public static void main(String[] args) {
        SBIBank b1 = new SBIBank();
        System.out.println(b1.getROI());
    }
}
