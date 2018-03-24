/*---------------------------------------------------------------------------
// AUTHOR:      	Michael Baldwin
// FILENAME:    	Lab5.java
// SPECIFICATION: 	This program is for practicing the switch statement, do-while, while and for loops.
// 					Using a while loop calculate the sum of integers from 1 to n. 
// 					Using a for loop find the factorial of n. 		
// INSTRUCTIONS:  	Read the following code skeleton and add your own code
//          		according to the comments.  Ask your TA or your class-
//          		mates for help and/or clarification.  When you see
//          		//--> that is where you need to add code.
// LAB LETTER:		D
// DATE:            9/30/2014
//-------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
	
		final int SUM = 1;
		final int FACTORIAL = 2;
		final int QUIT = 3;

		int choice;
	
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("This program does the following:");
			System.out.println("1. Sum of numbers from 1 to n.");
			System.out.println("2. Factorial of n");
			System.out.println("3. Quit");
		
			System.out.print("Please choose an option: ");
			choice = scan.nextInt();

			switch (choice)	{
				case SUM:	 
					System.out.print("Please enter a number: ");
					int num1 = scan.nextInt();

					int sum = 0;
					int count = 0;
				
					while(count < num1){
						count++;
						sum = sum + count;
					}
					System.out.print("The Sum of the numbers from 1 - ");
					System.out.println(num1 + " is: " + sum); // got too long
					break; // If no break is used, it will run the next case.
				
				case FACTORIAL:
					System.out.print("Please enter a number: ");
					int num2 = scan.nextInt();

					long fact = 1;
				
					for(int i=num2; i > 1 ; i--){
						fact = fact * i;
					}
				
					System.out.println("Factorial of " + num2 + " is: " + fact);
					break;
			
				case QUIT:
					System.out.print("Your choice was <QUIT>, Quitting the ");
					System.out.println("program, have a good day!");
					break;

				default:		
					System.out.print("Incorrect choice, <" + choice + ">, ");
					System.out.println("please choose again.");
					break; //optional because there's no cases after this	
			}
		}
		while(choice!=QUIT);	
	}
}

/*
 *  QUESTIONS FOR THOUGHT
    ---------------------
	1. Why does the factorial of large numbers become negative or zero, 
		Can you find the size of <int> using this information?
	A. because int has a limit to the size of the number it can store
	
	2. What is an infinite loop, can you write an infinite for loop.
	A. a loop that will never exit because the condition will never
		be false.  example: while true {} 
	
	3. What is the difference between a while loop and a do-while loop
	A. while loop checks the condition first, and if true, executes the
		code contained within it.  A do-while loop will execute the code
		contained in it once first before checking the condition, if true
		it will run the code again.
	
	4. Given any positive odd integer n, can you print the formation like below
		This is for n = 5
		    *
		   * *
		  * * *
		 * * * *
		* * * * *
		 * * * *
		  * * *
		   * *
		   	*
	A. 
import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will draw a diamond.");
		
		System.out.print("Please size of the diamond: ");
		int size = scan.nextInt();
		
		for (int i=1; i < size; i++) {
		
			for (int j=(size-i); j>0; j--)
				System.out.print(" ");
		
			for (int k=0; k<i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for (int i=size; i > 0; i--) {
		
			for (int j=(size-i); j>0; j--)
				System.out.print(" ");
		
			for (int k=0; k<i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
	
	
	5. Write a program to print the Fibonacci sequence for n numbers using while/for loops
		The Fibonacci sequence with 11 terms is
	 	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	 	NOTE: Every number is the sum of two numbers ahead of it, the first two numbers being 0 and 1
A.
import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int tempNum=0;
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will print the Fibonacci sequence");
		
		System.out.print("Please enter length of the sequence: ");
		n=scan.nextInt();
		
		System.out.print(num1 + ", " + num2 + ", ");
		
		for (int i=3; i<=n; i++) {
			if (i % 2 == 0) {
				tempNum = num1 + num2;
				num2 = tempNum;
				System.out.print(num2);
				if (i != n)
					System.out.print(", ");
			} 
			else {
				tempNum = num1 + num2;
				num1 = tempNum;
				System.out.print(num1);
				if (i != n)
					System.out.print(", ");
			}
		}
		System.out.println();
	}
}

*/