/*---------------------------------------------------------------------------
// AUTHOR:        Michael Baldwin
// FILENAME:      Lab7.java
// SPECIFICATION:   This program is to understand classes and loops
// INSTRUCTIONS:    Read the following comments and write the code from the scratch.
                    Ask your TA or your classmates for help and/or clarification. When you see
//                  //--> or ??? that is where you need to add code.
// LAB LETTER:	D
//-------------------------------------------------------------------------*/


import java.util.Scanner;

public class Lab7{
	public static void main(String[] args){

	Student stInstance = new Student("Michael Baldwin",27);

	System.out.println(stInstance.toString());
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter the student's new age: ");

	int newAge = scan.nextInt();

	stInstance.setAge(newAge);

	System.out.println(stInstance.toString());
	// Change the header for the Student class to private instead of public. Try to compile and run the program and note what happens.
	//--> ****** This is an experiment (dont include it in your submission) *******
	
	// Print Fibonacci Series i.e 1, 1, 2, 3, 5, 8, 13, 21, ...
	// The formula is currVal= prevVal + prevPrevVal
	// Define 3 integer variables currVal, prevVal and prevPrevVal. Initialize prevVal and prevPrevVal variables to 1
	// and initialize currVal to 2
	//-->
	int currVal = 2;
	int prevVal = 1;
	int prevPrevVal = 1;
	
	System.out.print("Fibonacci Series between 1 and 100:\n");

	// Print out prevVal
	//-->
	System.out.print(prevVal + ", ");
	// Print out prevPrevVal
	//-->
	System.out.print(prevVal);
	// Write a do-while loop to print out Fibonacci numbers less than or equals 100
	do{
		System.out.print(", ");
		// Print out the <currVal>
		//-->
		System.out.print(currVal);
		// Assign <prevVal> to <prevPrevVal>
		//-->
		prevPrevVal = prevVal;
		// Assign <currVal> to <prevVal>
		//-->
		prevVal = currVal;
		// Calculate <currVal> using the formula given earlier
		//-->
		currVal = prevVal + prevPrevVal;
	} // Check the while condition if <currVal> is less than or equals 100
	while(currVal <= 100);
	
	System.out.println();

	}
}