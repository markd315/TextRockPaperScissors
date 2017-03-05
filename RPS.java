import java.util.Random;
import java.util.Scanner; //Import the requistite libraries.

public class RPS
{
	public static void main(String[] args)
	{
		// Begin part 1!
		int k = new Random().nextInt(3);
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose Rock, Paper, or Scissors:");
		String input = in.nextLine(); // input string from console
		int u = 3;
		// Set U to represent user input
		if(input.equalsIgnoreCase("rock"))
			u = 0;
		else if(input.equalsIgnoreCase("scissors"))
			u = 1;
		else if(input.equalsIgnoreCase("paper"))
			u = 2;
		else
			System.out.println("Invalid input.");
		switch(k)// Winner logic
		{
			case 0:
				System.out.println("The program chose Rock");
				if(u == 0)
					System.out.println("Both players chose Rock and it is a tie");
				if(u == 1)
					System.out.println("Player 2 wins!");
				if(u == 2)
					System.out.println("Player 1 wins!");
				break;
			case 1:
				System.out.println("The program chose Scissors");
				if(u == 0)
					System.out.println("Player 1 wins!");
				if(u == 1)
					System.out.println("Both players chose Scissors and it is a tie");
				if(u == 2)
					System.out.println("Player 2 wins!");
				break;
			case 2:
				System.out.println("The program chose Paper");
				if(u == 0)
					System.out.println("Player 2 wins!");
				if(u == 1)
					System.out.println("Player 1 wins!");
				if(u == 2)
					System.out.println("Both players chose Paper and it is a tie");
				break;
			default:
				System.out.println("Something has gone horribly wrong.");
		}
		// Begin part 2!
		System.out.println();
		System.out.println("Please enter a word.");
		String word = in.nextLine();
		in.close(); // Avoid resource leaks (and annoying eclipse warnings)!.
		if(word.length() >= 2)
			System.out.println("The string without its first or last character: " + word.substring(1, word.length() - 1));// Substring indices start at 0 and have length equal to final index value. We want the first and last eliminated.
		else
			System.out.println("Try a bigger String, as the program is supposed to remove the first and last characters.");
	}
}
