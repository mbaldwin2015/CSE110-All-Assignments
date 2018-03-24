import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int tempNum=0;
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will print the Fibonacci sequence");
		
		System.out.print("Please enter length of the sequence: ");
		n=scan.nextInt();
		
		System.out.print(num1 + ", " + num2 + ", ");
		
		for (int i=3; i<=n; i++) {
			if (i % 2 == 0) {
				tempNum = num1 + num2;
				num2 = tempNum;
				System.out.print(num2);
				if (i != n)
					System.out.print(", ");
			} 
			else {
				tempNum = num1 + num2;
				num1 = tempNum;
				System.out.print(num1);
				if (i != n)
					System.out.print(", ");
			}
		}
		System.out.println();
	}
}