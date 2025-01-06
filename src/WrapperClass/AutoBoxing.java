package WrapperClass;

public class AutoBoxing {
    // converting primitive data type to it's object => autoboxing
    public static void main(String[] args) {
        int a = 10;
        Integer no = new Integer(a);
        Integer no2 = a;
        System.out.println(no2);
    }
}
