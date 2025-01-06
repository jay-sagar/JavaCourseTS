package Assigment;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr1 = {1, 4 ,5, 9};
        int[] arr2 = {0, 3, 7, 8, 11};

        int[] result = new int[arr1.length + arr2.length];

        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                result[index] = arr1[index1];
                index1++;
            } else {
                result[index] = arr2[index2];
                index2++;
            }
            index++;
        }

        while (index1 < arr1.length) {
            result[index] = arr1[index1];
            index++;
            index1++;
        }

        while (index2 < arr2.length) {
            result[index] = arr2[index2];
            index++;
            index2++;
        }
        System.out.println(Arrays.toString(result));
    }
}
