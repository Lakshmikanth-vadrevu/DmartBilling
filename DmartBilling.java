import java.util.Scanner;

public class DmartBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dmart Billing Process");

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter number of items:");
        int numberOfItems = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter item name:");
            String itemName = scanner.next();

            System.out.println("Enter item price:");
            double itemPrice = scanner.nextDouble();

            System.out.println("Enter item quantity:");
            int itemQuantity = scanner.nextInt();

            total += itemPrice * itemQuantity;
        }

        System.out.println("Bill Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total: " + total);

        System.out.println("Do you want to pay by cash or card? (cash/card)");
        String paymentMethod = scanner.next();

        if (paymentMethod.equalsIgnoreCase("cash")) {
            System.out.println("Please pay cash.");
        } else if (paymentMethod.equalsIgnoreCase("card")) {
            System.out.println("Please swipe your card.");
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}