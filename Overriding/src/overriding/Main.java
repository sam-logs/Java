package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine b = new Bike();
		Engine s = new Scooter();
		Engine a = new Aeroplane();
		b.engine();
		s.engine();
		a.engine();

	}

}
