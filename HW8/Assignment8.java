//***********************************************************
// Name: CSE110 Instructor
// Title: Assignment8.java
// Author: (if not you, put the name of author here)
// Description: Test code for Assignment8
// Time spent:  1 hour
// Date:  Posted on 11/14/2014
//**********************************************************
import java.util.*;
import java.io.*;

public class Assignment8{
	public static void main(String[] arg) throws FileNotFoundException {

		 		Ocean 	ocean;
		 		int oceanW, oceanH, shipNum;
		 		String line;
		 		Scanner in = new Scanner (System.in);
		        char command;  // command letter

		 		System.out.println(" ****** Program (Save ships) Starts ******");

		 		// ask a user to inpu the size of ocean width
		        System.out.print("\nInput the width of ocean:");
		        oceanW = in.nextInt();
		        // ask a user to input the size of ocean height
		        System.out.print("\nInput the hight of ocean:");
		         oceanH = in.nextInt();
		        // ask a user to input the file name for all ships
		         System.out.print("\nInput the name of data file:");
		         String fileName = in.next();

		         // Access to the file and create a Scanner object to read the text information
				 File file = new File (fileName);
           		 Scanner inFile = new Scanner(file);

       			line = inFile.nextLine();  // Read the first line showing the number of ships
       			shipNum = Integer.parseInt(line);

       			// Read each line and store the ship information into a string array
       			String[] shipData = new String[shipNum];

       			int count = 0;
		         while (inFile.hasNextLine())    {
					    line = inFile.nextLine();
					 	shipData[count] = line;  // each line shows the information of each ship
					 	count++;
				 } // End of reading lines
				 inFile.close(); // Close the file reader.

				// Create a Ocean object using the user inputs and file data
				ocean = new Ocean( oceanW, oceanH, shipNum);    //*** Need Ocean(int, int, int) constructor
				ocean.setShips(shipData);													  //*** Need Ocean's setShip(int) method
				ocean.printInfo();																	  //*** Need Ocean's printInfo() method
				printMenu();

		         do  {
		 					if (ocean.isSafe() ) {                                                      //*** Need Ocean's isSafe() method
		 						System.out.println ("\n****** All ships are saved ******");
		 						break;
							}
							System.out.print("\n****** Save ships in-trouble ******");
		 					System.out.print("\nInput a command:");
		 					command = in.next().charAt(0);

		 					switch(command){
		 						case 'w': 	case 'a':  case 's':  case 'd':
		 					        System.out.print("\nInput the index of ship to move: ");
		 					        if(!in.hasNextInt()) break;
		 					        int shipID = in.nextInt();
		 						    ocean.message(shipID, command);            //*** Need Ocean's message(int, char) method
		 						    ocean.updateSafe();											//*** Need Ocean's updateSafe() method
		 							break;
		 						case 'i':
		 							System.out.print("\n\t i [Display the information]");
									ocean.printInfo();												//*** Need Ocean's printInfo() method
									break;
		 						case '?': printMenu(); break;
		 						case 'q': break;
		 						default: System.out.print("\n\t Invalid: *** Type '?' to get the commands***"); break;
		 					}
		 		}while(command != 'q');

		 		 System.out.println("\n****** End of Program ******");
	} // end of main ()

	// Display the command menu
	public static void printMenu(){
		 		System.out.println();
		 		System.out.println("Command Options --------------------");
		 		System.out.println("w: Move up");
		 		System.out.println("a: Move left");
		 		System.out.println("s: Move down");
		 		System.out.println("d: Move right");
		 		System.out.println("i: Display the information");
		 		System.out.println("?: Display this menu ");
		 		System.out.println("q: Quit the program");
		 		System.out.println("------------------------------------");
	}
}