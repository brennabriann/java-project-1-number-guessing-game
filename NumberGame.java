//Number Guessing Game
//07/04/2018
import java.io.*;
import java.util.*;
public class NumberGame
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		int num = (int)Math.floor(Math.random() * 100);
		System.out.println(num);
	}
}
