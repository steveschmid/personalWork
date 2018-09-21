package inputExamples;

import java.util.Scanner;

public class LockerCombination 
{
	public static void main(String[] args)
	{
		//initialize variables
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		//receive input
		System.out.println("Locker Combination");
		System.out.println("Number 1:");
		num1 = input.nextInt();
		System.out.println("Number 2:");
		num2 = input.nextInt();
		System.out.println("Number 3:");
		num3 = input.nextInt();
		
		//output
		System.out.println("Your locker combination is \n" + num1 + " - " + num2 + " - " + num3);
		input.close();
	}
}
