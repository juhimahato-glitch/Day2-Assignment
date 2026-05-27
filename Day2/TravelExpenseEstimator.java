import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Distance (KM): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Petrol Price per Liter: ");
        double petrolPrice = sc.nextDouble();

        System.out.print("Enter Vehicle Mileage (KM/L): ");
        double mileage = sc.nextDouble();

        double petrolNeeded = distance / mileage;
        double totalCost = petrolNeeded * petrolPrice;

        System.out.println("\n----- TRAVEL DETAILS -----");
        System.out.println("Travel Distance: " + distance + " KM");
        System.out.println("Petrol Needed: " + petrolNeeded + " Liters");
        System.out.println("Total Travel Cost: " + totalCost);

        sc.close();
    }
}