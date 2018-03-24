//*****************************************************************************
// Name: Michael Baldwin
// Title: Assignment2.java
// Description: this program will compute the average of three integers, count
// the total number of characters in three words, and convert a given amount of
// seconds to hours:minutes:seconds 
// Time spent: 30 minutes
// Date: 9/9/2014
//*****************************************************************************

/*
Question 1:
a) true
b) false
c) true
d) true

Question 2:
import java.util.Scanner;

public class Fullname {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fName = in.next();
		
		System.out.print("Enter your last name: ");
		String lName = in.next();
	}
}

Question 3:
Hy
*/

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	final int NUMBER_OF_INTS = 3;
	
	System.out.println("First we will calculate the average of 3 numbers.");
	
	System.out.print("Enter the first number: ");
	int num1 = in.nextInt();
	
	System.out.print("Enter the second number: ");
	int num2 = in.nextInt();
	
	System.out.print("Enter the third number: ");
	int num3 = in.nextInt();
	
	double average = (double) (num1 + num2 + num3) / NUMBER_OF_INTS;
	System.out.printf("The average value is: %8.2f\n\n", average);
	
	System.out.println("Then we will return the total length of three words.");
	
	System.out.print("Enter the first word: ");
	String word1 = in.next();
	
	System.out.print("Enter the second word: ");
	String word2 = in.next();
	
	System.out.print("Enter the third word: ");
	String word3 = in.next();
	
	int totalLength = word1.length() + word2.length() + word3.length();
	
	System.out.printf("The total length of the words is: %d\n\n", totalLength);
	
	// next() only reads input until there is a space
	// nextLine() will read input including spaces until there is a \n
	
	System.out.println("We will now convert seconds to hours:minutes:seconds.");
	
	System.out.print("Enter the number of seconds: ");
	int seconds = in.nextInt();
	
	int hours = seconds / 3600;
	seconds = seconds % 3600;
	
	int minutes = seconds / 60;
	seconds = seconds % 60;
	
	System.out.printf("The time is: %d:%d:%d.\n\n", hours, minutes, seconds);
	
	System.out.println("Thanks for stopping by!");
	}
}