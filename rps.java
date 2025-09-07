import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a;

        String[] choices = { "1. Rock", "2. Paper", "3. Scissor" };

        System.out.println();

        System.out.println("**************************************");
        System.out.println("* WElCOME to Rock,Paper,Scissor Game *");
        System.out.println("**************************************");

        boolean wantToPlay = true;
        int round = 0;
        int won = 0;
        int loose = 0;
        int draw = 0;

        while (wantToPlay) {

            round++;

            System.out.println();
            System.out.println();

            for (String ch : choices) {
                System.out.println(ch);
            }

            System.out.println();

            System.out.print("Enter your choice : ");
            int usrCh = sc.nextInt();
            boolean input = true;
            if (usrCh < 0 || usrCh > 3) {
                input = false;
            }
            while (!input) {
                System.out.println();
                System.out.println("**** Invalid input! Please Enter between 1-3 ****");
                System.out.print("Enter your choice : ");
                usrCh = sc.nextInt();
                if (usrCh >= 0 && usrCh <= 3) {
                    input = true;
                }

            }
            System.out.println();

            if (usrCh >= 0 && usrCh <= 3) {
                System.out.println("You -----> " + choices[usrCh - 1]);
                input = true;
            }

            int computerCh = random.nextInt(1, 4);
            System.out.println("Computer ----> " + choices[computerCh - 1]);
            if (usrCh < 0 || usrCh > 3) {
                System.out.println("Invalid input! Please Enter between 1-3");
                input = false;
            }

            boolean win = false;

            if (usrCh != computerCh && usrCh == 1 && computerCh == 3)
                win = true;
            if (usrCh != computerCh && usrCh == 2 && computerCh == 1)
                win = true;
            if (usrCh != computerCh && usrCh == 3 && computerCh == 2)
                win = true;

            System.out.println();

            if (win) {
                System.out.println("* * * * * * *");
                System.out.println("*  YOU WON  *");
                System.out.println("* * * * * * *");
                won++;
            } else if (usrCh == computerCh) {
                System.out.println("* * * * *");
                System.out.println("* DRAW! *");
                System.out.println("* * * * *");

                draw++;
            } else {
                System.out.println("* * * * * * * *");
                System.out.println("*  YOU LOOSE  *");
                System.out.println("* * * * * * * *");

                loose++;
            }

            System.out.println();
            System.out.println();

            System.out.print("WANT to play again?? (Y/N) : ");
            char select;
            select = sc.next().toLowerCase().charAt(0);

            if (select == 'n') {
                wantToPlay = false;
            } else {
                wantToPlay = true;
            }

        }
        System.out.println();

        System.out.println("LEADERBOARD -->");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                             *");
        System.out.println("*              Total Round -> " + round + "               *");
        System.out.println("*                                             *");
        System.out.println("*   ::WIN-> " + won + "   ::LOOSE-> " + loose + "   ::DRAW-> " + draw + "      *");
        System.out.println("*                                             *");
        System.out.println("*                                             *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.println();
        System.out.println("THANKS For Playing miniProject by Reo");

        sc.close();
    }
}
