package inputExamples;
import java.util.Scanner;

public class FortuneTeller 
{

	public static void main(String[] args)
	{
		//initialize variables
		int weight = 0;
		int age = 0;
		int luckyNumber = 0;
		Scanner input = new Scanner(System.in);
		
		//recieve input
		System.out.print("Enter your weight: ");
		weight = input.nextInt();
		System.out.print("Enter your age: ");
		age = input.nextInt();
		System.out.print("Enter your lucky number: ");
		luckyNumber = input.nextInt();
		
		//construct response
		System.out.println("In the future...");
		System.out.println("I see...");
		System.out.println(luckyNumber + " years from now...");
		System.out.println("You will reside at number " + age + weight);
		System.out.println("at the old folks home.");
	}
}
