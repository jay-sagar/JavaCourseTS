package Assigment;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2 , 4, 8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
