//*********************************************************** 
// Name: Michael Baldwin
// Title: Assignment7.java
// Description: Practices using methods to manipulate an array
// Time spent: 2 hours
// Date: 11/13/2014
//**********************************************************

/*
Writing exercises

a) { 2, 2, 2, 2, 2, 2 }: each time it goes through the loop, it
	sets the current element to the previous element, the loop
	starts 1, so it sets 1's contents to 0's contents, then everything
	just becomes the same throughout the loop
	
b) { 2, 2, 4, 6, 8, 10 }: the loop starts at 5, and sets the current
	element equal to the one before it, it continues until it sets
	1's contents equal to 0's contents then stops
	
c) { 4, 6, 8, 10, 12, 12 }: starting with 0, it sets each element to
	the element that comes after it, stopping after change 4's contents
	equal to 5's
	
d) { 4, 4, 8, 8, 12, 12 }: starting with 4's element, it sets the current
	element equal to the one after it.  After each iteration of the loop,
	it goes down by 2 elements, setting 2 equal to 3, and 0 equal to 1.
	
e) { 2, 10, 8, 8, 10, 2 }: sets 1 equal to 4, then 2 equal to 3, then
	3 equal to 2, then 4 equal to 1, then 5 equal to 0, this creates
	a symmetrical array.
*/

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		int length;
		String name;
		char choice;
		int score;
		
		Scanner scan = new Scanner(System.in);
		
		Quiz coolGuy = new Quiz(100, "Unknown");
		
		System.out.println("Welcome to the program.");
		
		printMenu();
		
		do{
			System.out.print("Enter a choice: ");
			choice = scan.nextLine().charAt(0);
			switch(choice) {
				case 'n':
					System.out.print("Enter length of array: ");
					length = scan.nextInt();
					scan.nextLine();
					System.out.print("Enter name of student: ");
					name = scan.nextLine();
					coolGuy = new Quiz(length, name);
					System.out.println("\nNew data created.");
					break;
				case 'a':
					System.out.print("Enter score to add: ");
					score = scan.nextInt();
					scan.nextLine();
					coolGuy.add(score);
					break;
				case 'd':
					System.out.print("Enter score to delete: ");
					score = scan.nextInt();
					scan.nextLine();
					coolGuy.delete(score);
					break;
				case 'p':
					System.out.println("\nDisplaying the information:");
					coolGuy.print();
					break;
				case '?':
					printMenu();
					break;
				case 'q':
					break;
				default:
					System.out.println("\n\t ERROR Invalid Choice");
			}
		} while(choice != 'q');
		System.out.println(">>> Program Terminated <<<");
	}
	
	public static void printMenu() {
		System.out.println();
		System.out.println("Command Options");
		System.out.println("=============================");
		System.out.println("n: Create a new data");
		System.out.println("a: Add a score");
		System.out.println("d: Delete a score");
		System.out.println("p: Print the information");
		System.out.println("?: Display the menu again");
		System.out.println("q: Quit this program");
	}
}