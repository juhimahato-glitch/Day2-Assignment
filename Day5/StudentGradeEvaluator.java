import java.util.Scanner;

public class Main {

    public static String getGrade(int marks) {
        if (marks >= 80)
            return "A Grade";
        else if (marks >= 60)
            return "B Grade";
        else if (marks >= 40)
            return "C Grade";
        else
            return "Fail";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            System.out.println("Grade: " + getGrade(marks));

            System.out.print("Do you want to enter again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}