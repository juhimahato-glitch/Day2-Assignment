import java.util.Scanner;

public class EmployeeBonusEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter performance rating (1-5): ");
        int rating = sc.nextInt();

        int bonus = 0;

        // Immediate rejection condition
        if (attendance < 60) {
            System.out.println("Not Eligible");
            System.out.println("Bonus Rejected due to low attendance.");
        }
        // Main eligibility conditions
        else if (experience > 3 && attendance > 85) {

            switch (rating) {
                case 5:
                    bonus = 50000;
                    break;

                case 4:
                    bonus = 30000;
                    break;

                case 3:
                    bonus = 10000;
                    break;

                default:
                    bonus = 0;
            }

            if (bonus > 0) {
                System.out.println("Eligible");
                System.out.println("Bonus Amount = ₹" + bonus);
            } else {
                System.out.println("Not Eligible");
                System.out.println("No Bonus");
            }
        }
        else {
            System.out.println("Not Eligible");
            System.out.println("Conditions not satisfied.");
        }

        sc.close();
    }
}
