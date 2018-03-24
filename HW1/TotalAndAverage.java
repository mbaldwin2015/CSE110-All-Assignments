//********************************************************
// Name: Michael Baldwin
// Title: TotalAndAverage.java
// Description: Calculate the total and average scores.
// Time spent: 10 minutes
// Date: 8/27/2014
//********************************************************

public class TotalAndAverage {
	public static void main (String[] args) {
		final int COUNT = 5;
		int score0 = 98;
		int score1 = 100;
		int score2 = 80;
		int score3 = 62;
		int score4 = 77;
		double total = score0 + score1 + score2 + score3 + score4;
		double average = total/COUNT;
		
		System.out.println ("Total Score is: " + total);
		System.out.println ("Average Score is: " + average);
	}
}

// Error a: since totalAndAverage is a public class, it needs to be
//			declared in the file name, since the capital and lowercase
//			are different it makes the names different

// Error b: 