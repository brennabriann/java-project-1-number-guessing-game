//Number Guessing Game
//07/04/2018
import java.io.*;
import java.util.*;
public class NumberGame
{

	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		int num = (int)Math.floor(Math.random() * 100); //ramdom number between 1 and 100
		
		System.out.println("The computer has the secret number...");
		System.out.print("Enter your guess (1-100)");
		
		int guesscount = 0; //program counts number of guesses
		int guess = kbReader.nextInt();
		
		while (guess != num) //runs until user guesses right
		{
			if (guess > num && guess <= 100) //if user guesses too high
			{
			guesscount++;
			System.out.println("Too high... Try again.");
			System.out.print("Enter your guess (1-100):");
			guess = kbReader.nextInt();
			}
			else if (guess < num && guess >= 1) //if user guesses too low
			{
			guesscount++;
			System.out.println("Too low... Try again.");
			System.out.print("Enter your guess (1-100):");
			guess = kbReader.nextInt();
			}
			else //runs if user guesses number above 100 or below 1
			{
			System.out.print("Bad guess. Please re-enter:");
			guess = kbReader.nextInt();
			}
		}

		//code runs if user is correct
		guesscount++; //adds a guess when guessed correctly, code in loop does not run
		System.out.println("Correct!");
		System.out.println("You used " + guesscount + " guesses.");
	}
}
