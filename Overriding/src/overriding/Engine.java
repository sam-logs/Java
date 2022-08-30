package overriding;

public class Engine {
	void engine() {
		System.out.println("car engine starts.");
	}
}

class Bike extends Engine{
	void engine() {
		System.out.println("Bike engine starts.");
	}
}

class Scooter extends Engine{
	void engine() {
		System.out.println("Scooter engine starts.");
	}
}

class Aeroplane extends Engine{
	void engine() {
		System.out.println("Aeroplane engine starts.");
	}
}
