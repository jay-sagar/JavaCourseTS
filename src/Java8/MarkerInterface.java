package Java8;

public class MarkerInterface {
    int rollNo;

    MarkerInterface(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterface m1 = new MarkerInterface(1);
        MarkerInterface m2 = (MarkerInterface) m1.clone(); // downcasting
    }
}
