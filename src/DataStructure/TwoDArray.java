package DataStructure;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 3},
                {1, 2}
        };

        int[][] arr2 = {
                {3, 1},
                {4, 2}
        };
        matrixAddition(arr,arr2);
        matrixMultiplication(arr, arr2);
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixAddition(int[][] arr1, int[][] arr2) {
        int rowSize = arr1.length;
        int colSize = arr1[0].length;
        int[][] newArr = new int[rowSize][colSize];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixMultiplication(int[][] arr1, int[][] arr2) {
        int size = arr1.length;
        int[][] newArr = new int[size][size];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                for (int k = 0; k < newArr.length; k++) {
                    newArr[i][j] += arr1[i][k] * arr2[k][i];
                }
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
