package com.assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Area Calculator: ");
		System.out.println("Enter 1 for Square");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Circle");
		System.out.println("Enter 4 for Hexagon");
		System.out.println("Press any key exit");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.print("Enter side of square: ");
			int side=sc.nextInt();
			Square obj=new Square(side);
			System.out.println("Name of Shape is : "+obj.shapeName);
			System.out.println("Area of Square: "+obj.calculateArea());
		}else if(choice==2) {
			System.out.print("Enter length of rectangle: ");
			int length=sc.nextInt();
			System.out.print("Enter breadth of rectangle: ");
			int breadth=sc.nextInt();
			Rectangle obj=new Rectangle(length,breadth);
			System.out.println("Name of Shape is : "+obj.shapeName);
			System.out.println("Area of Rectangle: "+obj.calculateArea());
		}else if(choice==3) {
			System.out.println("Enter radius for circle: ");
			int radius=sc.nextInt();
			Circle obj = new Circle(radius);
			System.out.println("Name of Shape is : "+obj.shapeName);
			System.out.println("Area of Circle: "+obj.calculateArea());
		}else if(choice == 4){
			System.out.println("Enter side of hexagon: ");
			int side = sc.nextInt();
			Hexagon obj = new Hexagon(side);
			System.out.println("Name of Shape is : "+obj.shapeName);
			System.out.println("Area of Hexagon is: "+(5.19*side*side)/2);
			
		}else {
			System.out.println("Error in choice");
		}
		

	}

}
