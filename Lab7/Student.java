
// This is the class header for the class student
public class Student
{
	// Declaring the variables
	private String name;
	private int age;

	// Declaring the constructor for the Student class
	public Student(String someName, int someAge)
	{
		name=someName;
		age=someAge;
	}

	// Declaring the toString method which returns a String representation of the object.
	public String toString()
	{
		return ("Name is \t:"+name+"\nAge is \t\t:"+age);
	}

	// Declaring the setAge method which sets the age of the Student object
	public void setAge(int newAge)
	{
		age= newAge;
	}

}

