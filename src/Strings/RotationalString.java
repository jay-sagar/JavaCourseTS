package Strings;

public class RotationalString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ohell";

        String str = str1;
        boolean isRotation = false;
        if (str1.length() == str2.length()) {
            str += str;
            isRotation = str.contains(str2);
        }
        if (isRotation) System.out.println(str2 + " is a rotational string of " + str1);
    }
}
