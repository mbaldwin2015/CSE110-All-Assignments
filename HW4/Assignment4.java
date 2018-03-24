//*********************************************************** 
// Name: Michael Baldwin
// Title: Assignment5.java
// Description: This program will construct a table with a
//	specified amount of rows and columns (specified by the user)
//	and inside the table display a count from 1 to row*col
// Time spent: 30 minutes
// Date: 10/1/2014
//**********************************************************

/*  Writing Exercise  /*
a) This is because the 2014 in the scanner is a string, not
	an int.  This could be fixed by declaring variable a as
	a string and assigning it input.nextLine();
	
b) You would need to reduce the amount of iterations the inner
	for-loop goes through each time the outer for-loop enters
	an iteration.  This can be accomplished by changing the
	expression for the inner for loop to: 
	for (int j = 5; j > i; j--)
	
c) i = 80, j = 52, output is 4160

int count = 0;
for (int i = 0; i < 100; i++)
	for (int j = 0; j < 100; j++) {
		count++;
		if (count == 2014) {
			System.out.println("i is " + i + ", and j is " + j);
			System.out.println(i*j);
		}
		j += 3;
	}

*/

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		int row = 0;
		int col = 0;
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will construct a table with a ");
		System.out.println("specified number of columns and rows.");
		System.out.print("\nTo end the program, type something other ");
		System.out.println("than a positive integer.");
		
		do {
			int count = 0;
			
			System.out.print("\nEnter the number of columns then rows ");
			System.out.print("separated by a space: ");
			col = scan.nextInt();
			row = scan.nextInt();
			
			System.out.println();
			if (row > 0 && col > 0) {
				for (int i = 1; i <= (row+2); i++) {
					if (i == 1) {
						System.out.printf("%4s", "*");
						System.out.printf("%4s", "|");
						for (int j = 1; j <= col; j++)
							System.out.printf("%4d", j);
					}
					else if (i == 2)
						for (int j = 1; j <= (col+2); j++)
							System.out.printf("%4s", "----");
					else {
						System.out.printf("%4d", (i-2));
						System.out.printf("%4s", "|");
						for (int j = 1; j <= col; j++) {
							count++;
							System.out.printf("%4d", count);
						}
					}
					System.out.println();
				}
			}
		} while (row > 0 && col > 0);
		System.out.println("*** End of Program ***");
	}
}
