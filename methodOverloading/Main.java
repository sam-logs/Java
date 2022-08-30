package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading sum = new Overloading();  //without static
		sum.sum(5, 4);
		sum.sum(2, 9, 4);
		sum.sum(2.0, 3.9);
		
		//with static
		System.out.println(StaticSum.sum(3, 5));
		System.out.println(StaticSum.sum(3.0f, 8.0f));
	}

}
