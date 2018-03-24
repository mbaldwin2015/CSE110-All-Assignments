//*********************************************************** 
// Name: Michael Baldwin
// Title: Exam.java
// Description: A class definition that keeps exam scores of a person
// and the average of the scores
// Time spent: 2 hours
// Date: 10/14/2014
//**********************************************************

/* Writing Exercise
a) exam

b) addScore(int), isValid(), printInfo(), Exam(int, int, String), Exam()

c) 28, 40

d) 5 (6 if you include default)

e) b

*/

public class Exam {
	private int count;
	private int total;
	public String scores;
	
	public Exam () {
		count = 0;
		total = 0;
		scores = "";
	}
	
	public Exam (int examCount, int examTotal, String examScores) {
		count = examCount;
		total = examTotal;
		scores = examScores;
	}
	
	public int getCount() {
		return count;
	}
	
	public double calcAverage() {
		if (hasScore())
			return (double)total / count;
		else
			return 0;
	}
		
	private boolean hasScore() {
		if (count != 0)
			return true;
		else
			return false;
	}
	
	public boolean isValid() {
		int scoresCount = 0;
		int scoresNum = 0;
		int scoresTotal = 0;
		String partialScores = "";
		
		int pos = scores.indexOf(" ");
		int lastPos = 0;
		while (pos >= 0) {
			scoresCount++;
			partialScores = scores.substring(lastPos, pos);
			scoresNum = Integer.parseInt(partialScores);
			scoresTotal += scoresNum;
			lastPos = pos + 1;
			pos = scores.indexOf(" ", pos + 1);
		}
		if (pos == -1 && scores != "") {
			scoresCount++;
			partialScores = scores.substring(lastPos, scores.length());
			scoresNum = Integer.parseInt(partialScores);
			scoresTotal += scoresNum;
		}
		if (scoresCount == count && scoresTotal == total)
			return true;
		else
			return false;
	}
	
	public void addScore(int examScore) {
		count += 1;
		total += examScore;
		if (scores == "")
			scores += examScore;
		else
			scores = scores + " " + examScore;
	}
	
	public void printInfo() {
		System.out.println("\n\t-- Count: " + getCount());
		System.out.printf("\t-- Average: %2.2f\n", calcAverage());
		System.out.print("\t-- Scores: " + scores);
	}
}