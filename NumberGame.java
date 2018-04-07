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
		
		System.out.println(num);
		System.out.println("The computer has the secret number...");
		System.out.print("Enter your guess (1-100)");
		
		int guesscount = 0;
		int guess = kbReader.nextInt();
		if (guess == num)
		{
		guesscount++;
		System.out.println("Correct!");
		System.out.println("You used " + guesscount + " guesses.");
		}
	}
}
