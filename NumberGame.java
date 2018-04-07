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
		
		int guesscount = 0;
		int guess = kbReader.nextInt();
		
		while (guess != num)
		{
			if (guess > num && guess <= 100)
			{
			guesscount++;
			System.out.println("Too high... Try again.");
			System.out.print("Enter your guess (1-100):");
			guess = kbReader.nextInt();
			}
			else if (guess < num && guess >= 1)
			{
			guesscount++;
			System.out.println("Too low... Try again.");
			System.out.print("Enter your guess (1-100):");
			guess = kbReader.nextInt();
			}
			else
			{
			System.out.print("Bad guess. Please re-enter:");
			guess = kbReader.nextInt();
			}
		}

		//code runs if user is correct
		guesscount++;
		System.out.println("Correct!");
		System.out.println("You used " + guesscount + " guesses.");
	}
}
