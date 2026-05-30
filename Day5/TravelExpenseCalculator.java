import java.util.Scanner;

public class Main {

    public static double calculateTravelCost(double distance, double mileage, double petrolPrice) {
        double petrolNeeded = distance / mileage;
        return petrolNeeded * petrolPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Mileage (km/litre): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter Petrol Price per Litre: ");
        double petrolPrice = sc.nextDouble();

        double travelCost = calculateTravelCost(distance, mileage, petrolPrice);

        System.out.println("Estimated Travel Cost: " + travelCost);

        sc.close();
    }
}