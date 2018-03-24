/*---------------------------------------------------------------------------
// AUTHOR:        Michael Baldwin
// FILENAME:      Lab6.java
// SPECIFICATION:   This program is for practicing nested loops.
//                  It  prints out a right triangle of stars and
//                  finds all even and odd numbers less than a user entered
//                  number
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//              according to the comments.  Ask your TA or your class-
//              mates for help and/or clarification.  When you see
//              //--> that is where you need to add code.
// LAB LETTER:	D
//-------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("A right triangle of stars with a base and height of 10.");

        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
				System.out.print("*");
            }
			System.out.println();
        }

		System.out.println("\nNow we will find some even and odd numbers.");
		
		int num;
		
        do
        {
			System.out.print("Please enter an integer greater than 2: ");
			num = scan.nextInt();
			
            if (num <= 2)
                System.out.println("ERROR: " + num + " is not greater than 2.");
        }
		while(num <= 2);

		System.out.print("All the even numbers from 2 to " + num + " are: ");
        
		for(int i = 2; i < num; ++i) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("All the odd numbers from 2 to " + num + " are: ");

		for (int i = 2; i <= num; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}


/*Questions for thought:

    1. The three types of loops (for, while, and do-while) are all equivalent.  That is
         each can be turned into the other two.  How would you do each of these transformation.
         i.e. How would you turn a for into a while, or a while into a do-while, etc.
	Answer: 
		while into for:
			int i = 1;
			while (i <= 10) {
				some statements;
				++i;
			}
		
		for into do-while:
			System.out.print("Enter a number above 0: ");
			num = scan.nextInt();
			for (int i = 0; num <= 0; i++) {
				
				System.out.println("Try again.");
				
				System.out.print("Enter a number above 0: ");
				num = scan.nextInt();
			}
	
		while into do-while:
			System.out.print("Enter a number above 0: ");
			num = scan.nextInt();
			while (num <= 0) {
			
				System.out.println("Try again.");
				
				System.out.print("Enter a number above 0: ");
				num = scan.nextInt();
			}
		
    2. If the three types are equivalent, why does Java provide the three differnt types of loops?
         When is it more convenient to use a for loop? a while loop? a do-while loop?
		
		Answer: they all may be able to do the same thing if set up right, they all do it differently.
				for example, the while acting as a do while is redundant because you have the same
				code written twice.  for is best for set counts, if you need something to repeat only 10 times
				you would use a for.  While is best to use if you need something to repeat until a condition changes
				and do-while is best if you want a piece of code to run once first before checking for conditions
		
    3. Modify the stars program to print out a square of stars using nested loops (shown for a square of side 5):
         *****
         *****
         *****
         *****
         *****
		 
		for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5 ; j++)
            {
				System.out.print("*");
            }
			System.out.println();
        }
		 
    4. Modify the the first part of the assignment to print out a right triangle of stars that is
         right flushed (shown for a height and base of 5):
              *
             **
            ***
           ****
          *****
		
		 for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
				System.out.printf("%5s", "*");
            }
			System.out.println();
        }
		
    5. Why in finding if a number is prime do we only need to see if it has a divisor that is less
         than the square root of the number?
		 
		 because anything that is bigger than the square root of the prime number times itself is going to be
		 bigger than the prime number anyways.
		 
    6. How can you change the outer loop of the prime part to figure out the next 5 prime numbers
         after the number entered? The next m numbers, where m is a user entered value?
		 
		 I dunno we never made a loop that looks for prime numbers
*/