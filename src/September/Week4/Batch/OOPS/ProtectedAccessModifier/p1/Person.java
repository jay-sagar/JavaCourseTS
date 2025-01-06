package September.Week4.Batch.OOPS.ProtectedAccessModifier.p1;

// can access within the package but if you want to access outside the package
// it has to have parent child or subclass to do it
// you can no upcasting on this
public class Person {
    protected String getPersonName() {
        return "Smith";
    }
}
