//********************************************************
// Name: Michael Baldwin
// Title: Lab2.java
// Description: Program displays the use of variables of
//	different types and the use of math
// Time spent: 30mins
// 9/3/2014
//********************************************************

public class Lab2 {
	public static void main(String[] args) {
		// declaring variables, without initializing
		int age;
		double num;
		String firstName;
		String lastName;
		
		// initializing them with values
		age = 27;
		num = 10.0;
		firstName = "Michael";
		lastName = "Baldwin";
		
		// printing the variables
		System.out.printf("%s is %d years old\n", firstName, age);
		System.out.printf("%s, %s\n", lastName, firstName);
		System.out.println("Arbitrary Number: " + num);
		
		// declaring and initializing a new set of variables
		int x1 = 3, x2 = 4;
		int y1 = 5, y2 = 6;
		
		// declare and initialize new variables that will store
		// the results of the addition and multiplication
		// then print them
		int sop = x1 * x2 + y1 * y2;
		System.out.println("The sum of the products: " + sop);
		
		int pos = (x1 + x2) * (y1 + y2);
		System.out.println("The product of the sums: " + pos);
	}
}
