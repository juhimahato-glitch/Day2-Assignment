import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String category;
        int itemChoice, quantity;
        double price = 0;
        String itemName = "";

        System.out.println("===== Restaurant Menu =====");
        System.out.println("Veg");
        System.out.println("Non-Veg");

        System.out.print("Enter category: ");
        category = sc.nextLine();

        // Veg Menu
        if(category.equalsIgnoreCase("Veg")) {

            System.out.println("--- Veg Menu ---");
            System.out.println("1. Fried Rice - ₹150");
            System.out.println("2. Noodles - ₹120");

            System.out.print("Select Item: ");
            itemChoice = sc.nextInt();

            if(itemChoice == 1) {
                itemName = "Fried Rice";
                price = 150;
            }
            else if(itemChoice == 2) {
                itemName = "Noodles";
                price = 120;
            }
            else {
                System.out.println("Invalid Selection");
                return;
            }
        }

        // Non-Veg Menu
        else if(category.equalsIgnoreCase("Non-Veg")) {

            System.out.println("--- Non-Veg Menu ---");
            System.out.println("1. Chicken Biryani - ₹250");
            System.out.println("2. Grill Chicken - ₹400");

            System.out.print("Select Item: ");
            itemChoice = sc.nextInt();

            if(itemChoice == 1) {
                itemName = "Chicken Biryani";
                price = 250;
            }
            else if(itemChoice == 2) {
                itemName = "Grill Chicken";
                price = 400;
            }
            else {
                System.out.println("Invalid Selection");
                return;
            }
        }

        else {
            System.out.println("Invalid Selection");
            return;
        }

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        double total = price * quantity;

        sc.nextLine();

        System.out.print("Enter Member Status (Gold/Silver/Normal): ");
        String member = sc.nextLine();

        double discount = 0;

        if(member.equalsIgnoreCase("Gold")) {
            discount = total * 0.20;
        }
        else if(member.equalsIgnoreCase("Silver")) {
            discount = total * 0.10;
        }

        double finalBill = total - discount;

        System.out.println("\n===== BILL =====");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);

        if(finalBill > 2000 && member.equalsIgnoreCase("Gold")) {
            System.out.println("Congratulations! You get a FREE Dessert 🍨");
        }

        sc.close();
    }
}