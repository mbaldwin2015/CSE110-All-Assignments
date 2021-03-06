/*-------------------------------------------------------------------------
// AUTHOR: Michael Baldwin
// FILENAME: Assignment6.java
// SPECIFICATION: Uses a class to calculate if the sum of two numbers
//     is even or odd, the sum of every number between two numbers,
//     and to calculate if a year is a leap year or not
// FOR: CSE 110- homework #6- M/W/F 1:30-2:20
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

import java.util.*;

public class Assignment6 {
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);

       String choice;
	   char command;

	   // numbers used for input in the various cases
	   int num1, num2;


	   // print the menu
	   printMenu();
	   Geek myGeek = new Geek("Mike", 0);

	   do
	   {
		   // ask a user to choose a command
		   System.out.println("\nPlease enter a command or type ?");
		   choice = console.next().toLowerCase();
		   command = choice.charAt(0);

		   switch (command)
			{
				 case 'a':  //prints the Geek's name
						System.out.println("The Geeks name: " + 
							myGeek.getName());
					// Hint: See how number of questions is printed in case 'b'

					  break;
				 case 'b': //  prints how many questions have been asked
					  System.out.println("Number of questions: " +
							myGeek.getNumberOfQuestions());

					  break;
				 case 'c': // asks for two integers and finds and prints if their sum is even or odd
						System.out.print("Please enter a number: ");
						num1 = console.nextInt();
						
						System.out.print("Please enter another number: ");
						num2 = console.nextInt();
						
						if (myGeek.isEven(num1, num2) == true)
							System.out.println("The sum of these two numbers is even.");
						else
							System.out.println("The sum of these two numbers is odd.");
					 break;
				 case 'd': // asks for two integers and finds and prints the sum of all integers between them (inclusive)
						System.out.print("Please enter a number: ");
						num1 = console.nextInt();
						
						System.out.print("Please enter another number: ");
						num2 = console.nextInt();
						
						System.out.println("The sum of all integers between is: " + myGeek.sum(num1, num2));
					  break;
				 case 'e': // asks for a year and finds out and prints if is leap year or not
						System.out.print("Please enter a year: ");
						num1 = console.nextInt();
						
						if (myGeek.leapYear(num1) == true)
							System.out.println("This year is a leap year.");
						else
							System.out.println("This year is not a leap year.");
					  break;
				 case '?':
					  printMenu();
					  break;
				 case 'q':
					  break;

				 default:
					   System.out.println("Invalid input");

			}

		} while (command != 'q');

	}  //end of the main method


   public static void printMenu()
   {
	System.out.print("\nCommand Options\n"
				   + "-----------------------------------\n"
				   + "a: get name\n"
				   + "b: number of questions asked\n"
				   + "c: sum is even\n"
				   + "d: sum between two integers\n"
				   + "e: leap year\n"
				   + "?: display the menu again\n"
				   + "q: quit this program\n\n");

	} // end of the printMenu method


}

