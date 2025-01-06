package September.Week2.Batch;

import java.util.*;

public class HotelCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orderNo = 0;
        String choice = "";

        do {
            System.out.println("The Taj Palace");
            System.out.println("Menu Card");
            System.out.println("1. Starter");
            System.out.println("2. Main Course");
            System.out.println("3. Dessert");
            System.out.println("4. Beverages");
            System.out.println("5. Tea");
            System.out.println("Please order from above menu");
            orderNo = sc.nextInt();

            switch (orderNo) {
                case 1:
                    System.out.println("Your order for starter is placed successfully");
                    break;
                case 2:
                    System.out.println("Your order for Main course is placed successfully");
                    break;
                case 3:
                    System.out.println("Your order for dessert is placed successfully");
                    break;
                case 4:
                    System.out.println("Your order for Beverages is placed successfully");
                    break;
                case 5:
                    System.out.println("Your order for tea is placed successfully");
                    break;
                default:
                    System.out.println("Your input is invalid");
            }
            System.out.println("Do you want to order more food ? (Yes/No)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you! Visit Again");

    }
}

// HW
// Generate bill
