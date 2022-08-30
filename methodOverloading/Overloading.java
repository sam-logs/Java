package methodOverloading;

public class Overloading {
	public void sum(int a, int b) {
		System.out.println("Sum is : "+(a+b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("Sum is : "+(a+b+c));
	}
	public void sum(double a, double b) {
		System.out.println("Sum is : "+(a+b));
	}

}
