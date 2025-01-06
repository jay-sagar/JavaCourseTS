package September.Week2.Batch;

public class Pattern6 {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == 3) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

//****
//*  *
//*  *
//****
