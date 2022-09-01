package session2Task;

public class AreaCircle {
	private int radius;
	
	public AreaCircle(int radius) {
		this.radius = radius;
		
	}
	public void getArea() {
		double area;
		area = 3.14*radius*radius;
		System.out.println("Area of Circle is: "+area);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle area = new AreaCircle(4);
		area.getArea();
		

	}

}
