import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Loop
        while (true) {
            boolean gameStarted = false;

            // Starting the game here
            if (!gameStarted) {
                System.out.println("Hello, I'm Afridi. Let's play a game. \nGuess the number I am thinking of, okay?");
                System.out.print("Do you want to start the game? (yes/no): ");
                // making it case insensative

                String startGame = input.next().trim().toLowerCase();

                if (startGame.equals("no")) {
                    System.out.println("Alright, maybe next time!");
                    break;
                } else if (!startGame.equals("yes")) {
                    System.out.println("Please enter 'yes' to start the game or 'no' to quit.");
                    continue;
                }
            }

            int number = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("If you want to quit, then simply type 'quit' to exit.");
            // Loop
            while (true) {
                System.out.print("Enter a number: ");
                String inputText = input.next().trim();

                if (inputText.equals("quit")) {
                    System.out.println("Sorry to see you leaving. The correct number was " + number + ".");
                    break;
                }

                // Here : Validating and parse input manually
                boolean validInput = false;
                while (!validInput) {
                    try {
                        guess = Integer.parseInt(inputText);
                        validInput = true;
                    } catch (Exception e) {
                        System.out.print("Invalid input. Please enter a valid number: ");
                        inputText = input.next().trim();
                    }
                }

                attempts++;
                // Checking the number 
                if (guess > number) {
                    System.out.println("Oopss!!!! Too High.");
                } else if (guess < number) {
                    System.out.println("Awww !!! Too Low.");
                } else {
                    System.out.println("Yeaahhhhhh!! You got this, You are CORRECT! \nYou guessed it in " + attempts + " tries.");
                    System.out.println("The correct number was " + number + ".");
                    gameStarted = true;  // Indicating that the game has been successfully played
                    break;
                }

                if (attempts == 5) {
                    System.out.println("You've made 5 incorrect guesses. The correct number was " + number + ".");
                    number = (int) (Math.random() * 100) + 1;  // Generating a new number
                    System.out.println("Okay, Let's try again. Guess again.");
                    attempts = 0;  // Resetting the attempts for the new number
                }
            }

            // Asking the user if he will play the game again 
            if (gameStarted) {
                System.out.print("Wanna play again? (yes/no): ");
                String playAgain = input.next().trim().toLowerCase();

                if (playAgain.equals("no")) {
                    System.out.println("Aww!! You are going? We will miss you");
                    break;
                }
            }
        }

        input.close();
    }
}
