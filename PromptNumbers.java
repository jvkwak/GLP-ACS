/*
GLP ACS Mini-Lab 1

This program prompts the user to enter several numbers,
stores the numbers into an array,
then prints the numbers in forwards and backwards order.

Expected example output:

How many numbers will you enter? 4
Type a number: 12
Type a number: 8
Type a number: -2
Type a number: 39

Your numbers in forward order:
12
8
-2
39

Your numbers in backward order:
39
-2
8
12
*/
import java.util.Scanner;

public class PromptNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int count = console.nextInt();
		
		int [] number = new int [count];
		
		System.out.print("Type a number: ");
		for (int i = 0; i <count; i++) {
			// your code goes here; store the numbers
			int input = console.nextInt();
			number[i]=input;
		}
		
		System.out.println();
		System.out.println("Your numbers in forward order:");
		
		for (int i = 0; i < count; i++) {
			System.out.println(number[i]);
			
			// your code goes here; print the numbers in forward order
		
		}

		System.out.println();
		System.out.println("Your numbers in backward order:");
		for (int i = number.length-1; i>=0;i--)
		{
			System.out.println(number[i]);
		}
		
		// your code goes here; print the numbers in backward order
		
	}
	

	public static void printForward(int [] forwardArray)
	{
		for (int i=0; i<forwardArray.length; i++)
		{
			System.out.println(forwardArray[i]);
		}
	}
	public static void printBackward (int [] backArray)
	{
		for (int i = backArray.length-1; i>=0;i--)
		{
			System.out.println(backArray[i]);
		}
	}
}
