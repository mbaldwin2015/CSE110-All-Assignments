public class Quiz {
	private int[] scores;
	private int count;
	private String name;
	
	public Quiz(int length, String n) {
		scores = new int[length];
		for (int i=0; i < length; i++)
			scores[i] = -1;
		count = 0;
		name = n;
	}
	
	public void add(int numAdd) {
		if (count < scores.length) {
			scores[count] = numAdd;
			count++;
		}
		else
			System.out.println("Array is full. The value " + numAdd + 
									" cannot be added.");
	}
	
	public void delete(int delTaco) {
		int index = search(delTaco);
		if (index != -1) {
			for (int i=index; i < (count-1); i++)
				scores[i] = scores[i+1];
			scores[count-1] = -1;
			count--;
		} else if (index == -1)
			System.out.println("The value " + delTaco + 
			" was not found and cannot be deleted.");
		else
			System.out.println("what have you done to my program?");
	}
	
	public void print() {
		System.out.println(name);
		for (int i=0; i < count; i++) {
			if ((scores[i] != -1 && i % 5 != 0) || i == 0)
				System.out.print(scores[i] + "\t");
			else if (scores[i] != -1 && i % 5 == 0)
				System.out.print("\n" + scores[i] + "\t");
		}
		System.out.println();
	}
	
	private int search (int match) {
		int found = -1;
		int i=0;
		while (i < count && found == -1) {
			if (scores[i] == match)
				found = i;
			i++;
		}
		return found;
	}
}