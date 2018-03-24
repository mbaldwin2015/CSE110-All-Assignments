/*---------------------------------------------------------------------------
// AUTHOR:      Michael Baldwin
// FILENAME:    Lab3.java
// SPECIFICATION:   This program is for practicing the Scanner class,
//          decimal formatting and string functions
//          It takes the Users name and prints out various String operations
// LAB LETTER: D
//-------------------------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3
{
  public static void main(String[] args)
  {
	double decimalNum;
	String userName;
	String courseNum;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please enter your first name and last name with space in between: ");
	userName = scan.nextLine();

	System.out.print("Please enter your Course number (like MATH200): ");
	courseNum = scan.next();

	System.out.print("Please enter a number with 5 digits after decimal (like 45.4367): ");
	decimalNum = scan.nextDouble();

	System.out.println("User's name is: " + userName);

	System.out.println("The course number is: " + courseNum);
	DecimalFormat fmt = new DecimalFormat("0.##");
	
	System.out.println("The formatted decimal number is: " + fmt.format(decimalNum));

	System.out.println("Length of name \t\t" + (userName.length()-1));
	System.out.println("Case conversions \t\t" + userName.toLowerCase());
	System.out.println("Character at position 1 \t" + userName.charAt(0));
	System.out.println("Substring from user name \t" + userName.substring(0,3));
	System.out.println("Equality using compare to \t" + userName.compareTo(courseNum));
	System.out.println("Equality using equals \t\t" + userName.equals(courseNum));
	System.out.println("Equality ignoring case \t\t" + userName.equalsIgnoreCase(courseNum));


  }
}