import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/19/2017.
 */
public class BatterStats {

    public static void main(String[] args) {

        String answer = "";

        do {

        int atBats;
        double hits = 0;
        double bases = 0;
        Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Batting Average Calculator!");
            System.out.print("Please enter your player's total number of 'at bats': ");
            atBats = scan.nextInt();
            scan.nextLine();

            int[] atBatResults = new int[atBats];

            for (int i = 0; i < atBatResults.length; i++) {
                System.out.println("0 = Strikeout, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run!");
                System.out.print("For 'at bat' #, " + i + " enter the number of bases earned by the batter: ");
                atBatResults[i] = scan.nextInt();
            }

            for (int i = 0; i < atBatResults.length; i++) {
                if (atBatResults[i] >= 1) {
                    hits++;
                    bases += atBatResults[i];
                }
            }

            double batAvg = hits / atBats;
            double slugAvg = bases / atBats;


            System.out.println("Batting Average: " + (batAvg));
            System.out.print(("Slugging Average: ") + (slugAvg));

            System.out.println();

            System.out.println("Would you like to continue? Please 'y' or 'n'.");
            answer = scan.next();

        } while (answer.equals("y"));







    }
}

