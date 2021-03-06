//*****************************************************************************
// Name: Michael Baldwin
// Title: Assignment3.java
// Description: this program will compare three names, capitalize the first
// letter if it isn't already, and order the names alphabetically
// Time Spent: 2 hours and 30 minutes
// Date: 9/15/2014
//*****************************************************************************

/*
a)
boolean answer;
if (num % 2 > 0)
	System.out.println("num is odd");
else if (num % 2 == 0)
	System.out.println("num is even");
else
	System.out.println("I don't know what happened.");

b)
if (total >= 97 && total <= 100)
	System.out.println("total is between 97 and 100");
else 
	System.out.println("total is not between 97 and 100");

c)
System.out.println(str.equals("ASU"));

d)
a needs to be 1, and b can be 0 or 1
if a is 1, then the full expression is
(!(!(true) && true)) = (!(false && true)) = (!false) = (true)

e)
boolean answer = false;
if (x % 2 > 0 && y % 2 == 0)
	answer = true;
else if (x % 2 == 0 && y % 2 > 0)
	answer = true;
else
	answer = false;
System.out.println(answer);
*/

import java.util.Scanner;

public class Assignment3
{
	public static void main(String[] args) 
	{
		String name1;
		String name2;
		String name3;
		int wordError = 0;
		boolean name1Error = false;
		boolean name2Error = false;
		boolean name3Error = false;
		Scanner scan = new Scanner(System.in);

		System.out.print("We will take 3 names and display ");
		System.out.println("them alphabetically.");
		
		System.out.print("Enter the first name: ");
		name1 = scan.next();
		
		if(!(name1.charAt(0) >= 65 && name1.charAt(0) <= 90 ||
			name1.charAt(0) >= 97 && name1.charAt(0) <= 122))
		{
			System.out.println("This is not a valid name.");
			wordError++;
			name1Error = true;
		}
		else
		{
			name1 = name1.toLowerCase();
			name1 = name1.substring(0, 1).toUpperCase() + name1.substring(1);
		}
		
		System.out.print("Enter the second name: ");
		name2 = scan.next();
		
		if(!(name2.charAt(0) >= 65 && name2.charAt(0) <= 90 ||
			name2.charAt(0) >= 97 && name2.charAt(0) <= 122))
		{
			System.out.println("This is not a valid name.");
			wordError++;
			name2Error = true;
		}
		else
		{
			name2 = name2.toLowerCase();
			name2 = name2.substring(0, 1).toUpperCase() + name2.substring(1);
		}
		
		System.out.print("Enter the third name: ");
		name3 = scan.next();
		
		if(!(name3.charAt(0) >= 65 && name3.charAt(0) <= 90 ||
			name3.charAt(0) >= 97 && name3.charAt(0) <= 122))
		{
			System.out.println("This is not a valid name.");
			wordError++;
			name3Error = true;
		}
		else
		{
			name3 = name3.toLowerCase();
			name3 = name3.substring(0, 1).toUpperCase() + name3.substring(1);
		}
		
		if (wordError == 0) {
			System.out.print("\nThe names are ");
			if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
			{
				System.out.print("\"" + name1 + "\", ");
				if (name2.compareTo(name3) < 0)
				{
					System.out.print("\"" + name2 + "\", ");
					System.out.println("and \"" + name3 + "\".");
				}
				else
				{
					System.out.print("\"" + name3 + "\", ");
					System.out.println("and \"" + name2 + "\".");
				}
			}
			else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0)
			{
				System.out.print("\"" + name2 + "\", ");
				if (name1.compareTo(name3) < 0)
				{
					System.out.print("\"" + name1 + "\", ");
					System.out.println("and \"" + name3 + "\".");
				}
				else
				{
					System.out.print("\"" + name3 + "\", ");
					System.out.println("and \"" + name1 + "\".");
				}
			}
			else if (name3.compareTo(name1) < 0 && name3.compareTo(name2) < 0)
			{
				System.out.print("\"" + name3 + "\", ");
				if (name1.compareTo(name2) < 0)
				{
					System.out.print("\"" + name1 + "\", ");
					System.out.println("and \"" + name2 + "\".");
				}
				else
				{
					System.out.print("\"" + name2 + "\", ");
					System.out.println("and \"" + name1 + "\".");
				}
			}
		} else if (wordError == 1)
		{
			System.out.print("\nThe two valid names are ");
			if (name1Error == true)
			{
				if (name2.compareTo(name3) < 0)
				{
					System.out.print("\"" + name2 + "\" ");
					System.out.println("and \"" + name3 + "\".");
				}
				else
				{
					System.out.print("\"" + name3 + "\" ");
					System.out.println("and \"" + name2 + "\".");
				}
			}
			else if (name2Error == true)
			{
				if (name1.compareTo(name3) < 0)
				{
					System.out.print("\"" + name1 + "\" ");
					System.out.println("and \"" + name3 + "\".");
				}
				else
				{
					System.out.print("\"" + name3 + "\" ");
					System.out.println("and \"" + name1 + "\".");
				}
			}
			else if (name3Error == true)
			{
				if (name1.compareTo(name2) < 0)
				{
					System.out.print("\"" + name1 + "\" ");
					System.out.println("and \"" + name2 + "\".");
				}
				else
				{
					System.out.print("\"" + name2 + "\" ");
					System.out.println("and \"" + name1 + "\".");
				}
			}
		} else if (wordError == 2)
		{
			System.out.print("\nThe only valid name is ");
			if (name1Error == true && name2Error == true)
				System.out.println("\"" + name3 + "\".");
			else if (name1Error == true && name3Error == true)
				System.out.println("\"" + name2 + "\".");
			else if (name2Error == true && name3Error == true)
				System.out.println("\"" + name1 + "\".");
		}
		else
			System.out.println("No valid names were given");
	}
}