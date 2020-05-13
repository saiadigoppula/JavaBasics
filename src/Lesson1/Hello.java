package Lesson1;
public class Hello extends Student{

	public static void main(String[] args) {
		
	System.out.println(factorial(4));
	}
	
	public static int factorial(int N) {
		if (N <= 1) {
			return 1;
		}
		else {
			return (N* factorial(N-1));
		}
	}
}
