import java.util.Scanner;

public class SmartLoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "Java@123";

        int attempts = 0;
        boolean loginSuccess = false;

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        while (attempts < 3) {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loginSuccess = true;
                break;
            }
            else {
                attempts++;

                if (username.equals(correctUsername) &&
                    password.startsWith("Java") &&
                    password.endsWith("123")) {

                    System.out.println("Almost correct password");
                }
                else {
                    System.out.println("Wrong password");
                }
            }

            if (attempts == 3) {
                System.out.println("Account Blocked");
            }
        }

        // OTP Verification
        if (loginSuccess) {
            System.out.print("Enter OTP: ");
            int otp = sc.nextInt();

            if (otp >= 1000 && otp <= 9999) {
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Invalid OTP");
            }
        }

        sc.close();
    }
}
