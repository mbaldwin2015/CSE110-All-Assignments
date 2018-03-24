/*---------------------------------------------------------------------------
// AUTHOR:      Michael Baldwin
// FILENAME:    Lab4.java
// SPECIFICATION:   This program is for practicing the use of if-else conditional
//          expressions.  It also reviews some previous topics.
//          It asks the user for a string and determines some properties of the string.
//          It also asks the user to guess a random number after giving the user some hints.
// LAB LETTER: D
//-------------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Random;

public class Lab4 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = scan.next();

		if (word.compareTo("computer") == 0)
			System.out.println("OK computer");

		if (word.length() > 7)
			System.out.println(word + " is a long word!");

		Random rand = new Random();

		int num = rand.nextInt(30)+1;		
		
		System.out.println("I'm thinking of a number...");
		if (num >= 15)
			System.out.println("this number is greater than or equal to 15");
		else
			System.out.println("this number is less than 15");

        if(num >= 10 && num <= 20)
            System.out.println ("The number is between 10 and 20, inclusive");
        else
            System.out.println ("The number is not between 10 and 20, including 10 or 20");

		if (num < 5 || num > 25) {
			System.out.println("The number is an extreme number");
			System.out.println("The number is less than 5 or greater than 25");
		}
		else
			System.out.println("The number is not less than 5 and not greater than 25");

        System.out.print ("Guess the number: ");
        int guess = scan.nextInt();

        if (guess == num)
			System.out.println("Correct! the number was " + num);
        else
        {
            System.out.println ("Sorry, that is not correct");
			System.out.println("Here it is: " + num);
        }
	}
}


/**************************************************************************************************
** Questions for thought:
**    1.  What type of conditions are conditionals (if-else statements) based on?
**    2.  What type of values do the equality and relational operators return?
**    3.  a) What are the different boolean, equality operators and relational operators?
**        b) What is the order of operations among the operators?
**    4.  What is the difference between the equality and assignment operators?
**    5.  What is a block statement?  When are they used in conditional statements?
**    6.  What is a nested if statement?
**    7.  How do we compare two strings for equality in Java?
**************************************************************************************************/