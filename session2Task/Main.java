package session2Task;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Sam", 25000.98);
		Employee emp1 = new Employee(102, "Ram", 60000.60);
		Employee emp2 = new Employee(103, "Jack", 80000.00);
		Employee emp3 = new Employee(104, "Daniel", 212000.80);
		emp.showDetails();
		emp1.showDetails();
		emp2.showDetails();
		emp3.showDetails();
		emp.countObject();
		emp.salaryCount();
		emp1.salaryCount();
		emp2.salaryCount();
		emp3.salaryCount();
		
		
		
	}

}
