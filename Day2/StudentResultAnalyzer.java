import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        System.out.println("\n----- RESULT -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average > 50) {
            System.out.println("Average is greater than 50");
        } else {
            System.out.println("Average is not greater than 50");
        }

        sc.close();
    }
}