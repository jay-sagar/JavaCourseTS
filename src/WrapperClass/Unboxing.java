package WrapperClass;

public class Unboxing {
    // converting objects to its corresponding primitive data types => unboxing
    public static void main(String[] args) {
        Integer a = 20;
        int no = a.intValue();
        int no2 = a;
        System.out.println(no2);
        System.out.println(no);
    }
}
