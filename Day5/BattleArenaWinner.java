import java.util.Scanner;

public class Main {

    public static String findWinner(int p1, int p2) {
        if (p1 > p2)
            return "Player 1 Wins";
        else if (p2 > p1)
            return "Player 2 Wins";
        else
            return "Match Draw";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 Score: ");
        int player1 = sc.nextInt();

        System.out.print("Enter Player 2 Score: ");
        int player2 = sc.nextInt();

        System.out.println(findWinner(player1, player2));

        sc.close();
    }
}