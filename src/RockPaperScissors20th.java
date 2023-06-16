import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors20th {
    public static void main(String[] args) {

        //user choice
        System.out.print("Enter 0(rock) or 1(paper) or 2(scissors)");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        //computer choice
        System.out.print("Computer choice: ");
        Random random = new Random();
        int computerChoice = random.nextInt();

        if(userChoice == computerChoice)
            System.out.println("Tie");
        else if (userChoice < computerChoice)
            System.out.println("Computer wins");
        else if (userChoice > computerChoice)
            System.out.println("You wins");

    }
}
