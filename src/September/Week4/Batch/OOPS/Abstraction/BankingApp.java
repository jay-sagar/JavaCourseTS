package September.Week4.Batch.OOPS.Abstraction;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank name : ");

        String bankName = sc.next();

        Bank b1 = null;

        if (bankName.equals("SBI")) {
            b1 = new SBI();
            System.out.println("SBI ROI : " + b1.getROI());
        } else if(bankName.equals("ICICI")) {
            b1 = new ICICI();
            System.out.println("ICICI ROI : " + b1.getROI());
        } else {
            System.out.println("Please enter correct bank name ");
        }
    }
}
