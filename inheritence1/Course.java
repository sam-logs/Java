package inheritence1;

public class Course extends Student {
	String Course ;
	public void showCourse() {

		System.out.println("Student Course is : "+Course);
		System.out.println("Student Age is : "+getAge());
		System.out.println("Student Name is : "+getName());
		System.out.println("Student Roll No is : "+getRoll_no());
		
	}
}
