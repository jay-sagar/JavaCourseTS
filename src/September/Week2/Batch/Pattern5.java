package September.Week2.Batch;

public class Pattern5 {
    public static void main(String[] args) {
        int row = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row - 1; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//*
//**
//***
//**
//*
