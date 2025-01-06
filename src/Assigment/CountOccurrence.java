package Assigment;

public class CountOccurrence {
    public static void main(String[] args) {
        String str = "aaabbcdddddeeeeeeee";

        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[i] > 0) {
                System.out.println((char)('a' + i) + " frequency: " + arr[i]);
            }
        }
    }
}
