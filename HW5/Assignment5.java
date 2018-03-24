//***********************************************************
// Name: CSE110 Instructor
// Title: Assignment5.java
// Author: (if not you, put the name of author here)
// Description: Test code for Assignment5
// Time spent:  1 hour
// Date:  Posted on 10/3/2014
//**********************************************************
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] arg){

		 		System.out.println(" ****** Tester Program ******");
		 		printMenu();
		 		Scanner in = new Scanner (System.in);
		        char command;  // command letter
		         Exam exam = new Exam();

		         do{
		 					System.out.print("Please input a command:");
		 					command = in.nextLine().charAt(0);
		 					switch(command){
		 						case 'a':
		 							System.out.print("\n\t a [Input a new score]: ");
		 							int score=in.nextInt(); // read the first integer
		 						    String linebreak = in.nextLine(); // flash the linebreak
		 							exam.addScore(score);
		 							System.out.print("\n\t A new score " +score+ " is added.");
		 							break;
		 						case 'b':
		 							System.out.print("\n\t b [Create a new exam] " );
		 							System.out.print("\n\t [Input the count of scores]: " );
		 							int count = in.nextInt();//read an integer
		 							System.out.print("\n\t [Input the total of scores]: " );
		 							int total = in.nextInt();//read an integer
		 							in.nextLine(); // flash the linebreak
		 							System.out.print("\n\t [Input a list of integers in a single line]: " );
		 							String scores = in.nextLine(); //read a list of integers as a single line
		 							exam = new Exam(count, total, scores);
		 							if (exam.isValid())
		 									System.out.print("\n\t A new Exam is constructed with " +count+", "+ total+", \""+ scores +"\"");
		 							else{
		 								   System.out.print("\n\t Inputs are invalid.");
		 								   exam = new Exam();
									 }
		 							break;
		 						case 'p':
		 							System.out.print("\n\t p [Display the information]");
		 							exam.printInfo();
		 							break;
		 						case '?': printMenu(); break;
		 						case 'q': break;
		 						default: System.out.print("\n\t Invalid: *** Type '?' to get the commands***"); break;
		 					}
		 					System.out.println("\n");
		 		}while(command != 'q');
		 		 System.out.println(" ****** End of Program ******");
	} // end of main ()

	// Display the command menu
	public static void printMenu(){
		 		System.out.println();
		 		System.out.println("Command Options --------------------");
		 		System.out.println("a: Add a  score");
		 		System.out.println("b: Create a New exam with a list of integers");
		 		System.out.println("p: Display the information");
		 		System.out.println("q: Quit the program");
		 		System.out.println("?: Display this menu ");
		 		System.out.println("------------------------------------");
	}
}