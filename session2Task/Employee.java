package session2Task;

public class Employee {
	private static int count;
	private int eid;
	private String name;
	private double salary;
	
	private static String company="Bhavna Corp";
	
	public Employee(int eid,String name,double salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		count ++;
	}
	public void showDetails() {
		System.out.println("Eid ="+" "+eid+" " + "Name = "+name+" " +"salary= "+salary);
	}
	public static void showCompany() {
		System.out.println(company);
	}
	public static void countObject() {
		System.out.println("Number of Objects are: "+Employee.count);
	}
	public void salaryCount() {
		if(salary>50000) {
			System.out.println("Employees having salary greater than 50k are: "+"Eid ="+" "+eid+" " + "Name = "+name+" " +"salary= "+salary);
		}
	}

}
