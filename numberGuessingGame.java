import java.io.*;
import java.util.*;
public class numberGuessingGame {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      int secretNum = (int)Math.floor(Math.random() * 101); //Generates a random number between 0 and 100
      int userGuess = 0, numGuesses = 0;
      System.out.println("The computer has the secret number...");
      while (userGuess != secretNum) {
         try { //Tries to run code, catches exceptions so they don't end program
            System.out.print("Enter your guess (1-100): ");
            userGuess = kbReader.nextInt();
            while (userGuess <= 0 || userGuess >= 100) { //Asks user for new input if guess is outside range
               System.out.print("Bad guess. Please re-enter: ");
               userGuess = kbReader.nextInt();
            }
            numGuesses++;
            if (userGuess > secretNum) {
               System.out.println("Too high... Try again.");
            }
            else if (userGuess < secretNum) {
               System.out.println("Too low... Try again.");
            }
            else {
               System.out.println("Correct!");
            }
         }
         catch (Exception e) {
            System.out.println("Please only input integers.");
            kbReader.next();
         }
      }
      System.out.println("You used " + numGuesses + " guesses.");
   }
}
