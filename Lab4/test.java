public class test {
	public static void main(String[] args) {
		int x = 6;
		
		switch (x) {
			case 6: x += 2;
			case 7: x += 100;
			case 8: x--;
		}
		
		System.out.println("you failed the exam: " + x);
		
	}
}