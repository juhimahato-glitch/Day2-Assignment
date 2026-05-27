import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();

        boolean canWithdraw = balance > withdrawal;

        System.out.println("\n----- ACCOUNT DETAILS -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawal);
        System.out.println("Balance > Withdrawal : " + canWithdraw);

        if (canWithdraw) {
            double remainingBalance = balance - withdrawal;
            System.out.println("Remaining Balance: " + remainingBalance);
        } else {
            System.out.println("Insufficient Balance!");
        }

        sc.close();
    }
}