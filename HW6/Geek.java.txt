public class Geek {
	private String name;
	private int numQuestions;
	
	public Geek (String name, int numQuestions)
	{
		this.name = name;
		this.numQuestions = numQuestions;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumberOfQuestions()
	{
		return numQuestions;
	}
	
	public boolean isEven (int num1, int num2)
	{
		numQuestions++;
		if ((num1 + num2) % 2 == 0)
			return true;
		else
			return false;
	}
	
	public int sum (int num1, int num2)
	{
		numQuestions++;
		int total = 0;
		if (num1 < num2) {
			for (int i = 0; i <= (num2 - num1); i++)
				total += (num1 + i);
			return total;
		}
		else if (num1 > num2) {
			for (int t = 0; t <= (num1 - num2); t++)
				total += (num2 + t);
			return total;
		}
		else
			return num1 + num2;
	}
	
	public boolean leapYear (int year)
	{
		numQuestions++;
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		else if (year % 400 == 0)
			return true;
		else
			return false;
	}
}