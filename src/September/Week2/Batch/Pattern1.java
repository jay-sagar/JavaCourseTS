package September.Week2.Batch;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//  *
// **
//***