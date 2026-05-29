import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin;

        while (true) {

            System.out.print("Enter ATM PIN: ");
            pin = sc.nextInt();

            if (pin == 1234) {
                System.out.println("Correct PIN Access Granted");
                break;
            } else {
                System.out.println("Wrong PIN Try Again");
            }
        }

        sc.close();
    }
}