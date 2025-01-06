package September.Week1.StudyBatch;

public class Pattern9 {
    public static void main(String[] args) {
        int row = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//  *
// ***
//*****