package DataStructure;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {9, 50, 99, 15, 40, 10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        // Max number
        System.out.println(arr[arr.length - 1]);

        // Second-Highest Number
        System.out.println(arr[arr.length - 2]);

    }

    static void selectionSort(int[] arr) { // O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
