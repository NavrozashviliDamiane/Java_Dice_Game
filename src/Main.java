import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game!");
        System.out.println("Rules: You will roll a dice and place a bet on a number between 1 and 6.");
        System.out.println("If your chosen number matches the rolled number, you win!\n");

        boolean playAgain = true;

        while (playAgain) {
            System.out.print("Place your bet (enter a number between 1 and 6): ");
            int userBet = scanner.nextInt();

            if (userBet < 1 || userBet > 6) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            int rolledNumber = (int) (Math.random() * 6) + 1;

            System.out.println("\nRolling the dice...");
            System.out.println("You rolled a " + rolledNumber + ".");

            if (userBet == rolledNumber) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("Sorry, you lost.");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            if (playAgainInput.equals("no")) {
                playAgain = false;
            }

            System.out.println();
        }

        System.out.println("Thank you for playing the Dice Game!");

        scanner.close();
    }
}
