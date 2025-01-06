package September.Week1.StudyBatch;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;
        System.out.println(i);

        int i2 = 100;
        long l = i2;
        System.out.println(l);

        long l2 = 434343423434l;
        float f = l2;
        System.out.println(f);

        long l3 = 3342434l;
        double d = l3;
        System.out.println(d);

        float f2 = 10.5f;
        double d2 = f2;
        System.out.println(d2);

    }

}
