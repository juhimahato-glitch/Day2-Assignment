import java.util.Scanner;

public class CollegeAdmissionPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        double average = (maths + physics + chemistry) / 3.0;

        // Automatic rejection
        if (maths < 35 || physics < 35 || chemistry < 35) {
            System.out.println("Admission Rejected");
        }
        else {
            // Eligibility conditions
            if ((maths >= 70 && physics >= 60 && chemistry >= 60)
                    || average >= 80) {

                System.out.println("Eligible for Admission");
            }
            else {
                System.out.println("Not Eligible for Admission");
            }

            // Scholarship condition
            if (maths > 90 && physics > 90 && chemistry > 90) {
                System.out.println("Eligible for Scholarship");
            }
        }

        sc.close();
    }
}