package Assigment;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4};

        List<Integer> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempMax = 0;
            List<Integer> tempList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                tempMax += arr[j];
                tempList.add(arr[j]);
            }
            if (tempMax > max) {
                max = tempMax;
                list = tempList;
            }
        }
        System.out.println(list + " with the max value of: " + max);
    }
}
