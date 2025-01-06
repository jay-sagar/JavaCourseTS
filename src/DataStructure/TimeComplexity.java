package DataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// time complexity of all sorting and searching
// write a program to right shift of an array by two position
// wap to remove duplicate array from an array
// find the largest array of the array
// find second-largest array
// write a to move all zeros to end of the array
// wap to check given array is balanced or not
// wap to convert a string into a integer from a given array
// wap to print city names from the given array who's length is greater than 5
public class TimeComplexity {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rightShift(arr, 2)));

        int[] arr2 = {2, 2, 3, 4, 5, 5};
        System.out.println(removeDuplicate(arr2));

        int[] arr3 = {3, 2, 1, 4, 5, 0, 0, 0};
        System.out.println(Arrays.toString(moveZeros(arr3)));

        int[] arr4 = {1, 2, 3, 5, 6};
        missingNumber(arr4);

        int[] arr5 = {2, 5, -5, 3, -2, -3};
        balancedArray(arr5);

        int[] arr6 = {3, 31, 32, 44, 12, 99, 99};
        secondMaxValue(arr6);

        String[] arr7 = {"12", "24", "56", "89"};
        System.out.println(Arrays.toString(convertIntoInteger(arr7)));

        String[] city = {"Latur", "Kolhapur", "Pune", "Solpur", "Nashik", "Nagpur", "Mumbai"};
        cityWithLength5(city);
    }

    static int[] rightShift(int[] arr, int count) {
        int shift = count % arr.length;
        if (shift  == 0) return arr;
        System.out.println(shift);

        while (shift --> 0) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    static ArrayList<Integer> removeDuplicate(int[] arr) {
        Arrays.sort(arr);

        ArrayList<Integer>  list = new ArrayList<>();
        int counter = arr[0];
        list.add(counter);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == counter) continue;

            counter = arr[i];
            list.add(counter);
        }

        return list;
    }

    static int[] moveZeros(int[] arr) {
        int countIndex = 0;

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[countIndex] = arr[i];
                countIndex++;
            }
        }
        return newArr;
    }

    static void missingNumber(int[] arr) {
        int size = arr.length + 1; // because one element is missing
        int totalSum = (size*(size + 1)) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int missingNumber = totalSum - sum;
        System.out.println(missingNumber);
    }

    static void balancedArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    static void secondMaxValue(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Second max value: " + secondMax);
    }

    static int[] convertIntoInteger(String[] arr) {
        int[] newArr = new int[arr.length];;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }
        return newArr;
    }

    static void cityWithLength5(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


