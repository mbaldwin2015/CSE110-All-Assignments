//*****************************************************************************
// Name: Michael Baldwin
// Title: Assignment1.java
// Description: Prints my name, birthday, and calendar of my birth month
// Time Spent: 40 minutes
// Date: 8/28/2014
//*****************************************************************************

/*
Program #1 answers a-e
a)  since totalAndAverage is different from TotalAndAverage, the  
	compiler cannot find the class totalAndAverage because the file 
	is named TotalAndAverage.java
b)  since 'Total Score is: ' is no longer a string, the method wants to print 
	the variable 'Total' but there is no closing bracket ')' after 
	so the compiler is asking for one.  Also, it is looking for the closing 
	string literal to match the first open one "
c)  The file compiled fine and the output is still valid.  Since we just
	added three statements that had no content, it didn't change anything
d)  The compiler can't find the end of the public class TotalAndAverage
e)  The output of total changed from 417.0 to 417, which removed the fraction
	for this number.  Now since the Average Score is computing the quotient
	of two int's instead of one int one double, the answer removes the .4
	needed for the Average Score to be accurate.
*/

// Start of program #2
public class Assignment1 {
	public static void main(String[] args) {
		String firstName = "Michael";
		String lastName = "Baldwin";
		String birthday = "\"March 3rd, 1987\"";
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Birthday: " + birthday + "\n");
		System.out.println("March 1987");
		System.out.println("SU\tM\tT\tW\tTH\tF\tSA");
		System.out.println("----\t----\t----\t----\t----\t----\t----");
		System.out.print("1\t2\t3\t4\t5\t6\t7\n8\t9\t10\t11\t12\t13\t14\n");
		System.out.print("15\t16\t17\t18\t19\t20\t21\n22\t23\t24\t25\t26");
		System.out.print("\t27\t28\n29\t30\t31\n");
	}
}