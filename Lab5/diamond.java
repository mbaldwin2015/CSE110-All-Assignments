import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will draw a diamond.");
		
		System.out.print("Please size of the diamond: ");
		int size = scan.nextInt();
		
		for (int i=1; i < size; i++) {
		
			for (int j=(size-i); j>0; j--)
				System.out.print(" ");
		
			for (int k=0; k<i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for (int i=size; i > 0; i--) {
		
			for (int j=(size-i); j>0; j--)
				System.out.print(" ");
		
			for (int k=0; k<i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}