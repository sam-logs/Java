package com.array;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com[];
		com = new Company[5];
		
		com[0] = new Company(101,"HCL","Patan",500,80);
		com[1] = new Company(102,"TCS","Patan",300,90);
		com[2] = new Company(103,"BHAVNA","Noida",5000,400);
		com[3] = new Company(104,"EY","Noida",6000,50);
		com[4] = new Company(105,"Accenture","Pune",7000,600);
		//Display All Companies
		System.out.println("Display All Companies");
		for(Company com1:com) {
			com1.display();
		}
		//Display All Companies having employee greater than 100
		System.out.println("Display All Companies having employee greater than 100");
		for(Company com1:com) {
			if(com1.getNumberOfEmployees()>100) {
			com1.display();
			}
		}
		
		// Display All Companies  from Patan
		System.out.println("Display All Companies  from Patan");
		for(Company com1:com) {
			if(com1.getCity()=="Patan") {
			com1.display();
			}
		}
		//Display All Companies Record having turnover between 1000-10000
		System.out.println("Display All Companies Record having turnover between 1000-10000");
		for(Company com1:com) {
			if(com1.getTurnover()>1000 && com1.getTurnover()<10000) {
			com1.display();
			}
		}

	}

}
