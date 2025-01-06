package September.Week1.StudyBatch;

public class Pattern10 {
    public static void main(String[] args) {
        int row = 3;

        for (int i = row; i >= 1; i--) {
            for (int j = row - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i -1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//*****
// ***
//  *
