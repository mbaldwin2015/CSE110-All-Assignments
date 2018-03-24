/*---------------------------------------------------------------------------
// AUTHOR:		Michael Baldwin
// FILENAME:	Lab9.java
// SPECIFICATION:   This program is for practicing the use classes, constructors,
//          helper methods.
// INSTRUCTIONS:  Read the following code skeleton and add your own code
//          according to the comments.  Ask your TA or your class-
//          mates for help and/or clarification.  When you see
//          //--> that is where you need to add code.
// LAB LETTER: D
//-------------------------------------------------------------------------*/

import java.util.Scanner;
public class Lab9
{
	public static void main(String[] args)
	{

		System.out.println("Creating Spider-Man.......");
		// Create a SuperHero spiderman with the name "Spider-Man", secret identity "Peter Parker"
		// and he has not saved any one yet
		//-->
		SuperHero spiderman = new SuperHero("Spider-Man", "Peter Parker", 0);

		// Ask the user to enter his super hero's name
		System.out.println("\nWhat is your super hero's name?");
		// Creating Scanner object
		Scanner scan = new Scanner(System.in);
		// Take the super hero's name as input and assign it to a String variable heroName
		//-->
		String heroName = scan.nextLine();
		System.out.println("What is his secret identity?");
		// Take the super hero's secret identity as input and assign it to a String variable secretIdentity
		//-->
		String secretIdentity = scan.nextLine();
		System.out.println("Creating your super hero.......");
		// Create a yourHero object of the class SuperHero with the heroName and secretIdentity as inputs and
		// with numberOfPeopleSaved 10
		//-->
		SuperHero yourHero = new SuperHero(heroName, secretIdentity, 10);
		System.out.println("\nSpider-Man just saved a flight and saved 100 lives!");
		// Call the recordSave method with 100 as input
		//-->
		spiderman.recordSave(100);
		System.out.println("Oh just learnt that Spider-Man was shot dead twice in this incident");
		// Call the method that will kill the hero twice
		//-->
		//-->
		spiderman.killHero();
		spiderman.killHero();
		System.out.println("\nYour hero saved a kidnapped kid but unfortunately was shot once");
		// Call the method that will kill the hero
		//-->
		yourHero.killHero();
		// Call the method that will add 1 more to the lives saved
		//-->
		yourHero.recordSave();
		System.out.println("\nNow printing the super hero database:\n*************************************\n");
		// for the ??? call the method in the SuperHero class that will return numberOfHeroes
		System.out.println("There are " + yourHero.getNumberOfHeroes() + " known superheroes.");
		// Print out the record of spiderMan
		//-->
		spiderman.printSuperHeroRecord();
		// Print the record of yourHero
		//-->
		yourHero.printSuperHeroRecord();
	}
}