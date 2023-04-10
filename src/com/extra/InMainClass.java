package com.extra;

class Emp{
	int empid;
	String empname="Arun";
	
	
	
	public Emp() {
		System.out.println("From Emp Constr");
	}


	public Emp(int empid) {
		this("Hello");
		this.empid=empid;
		System.out.println("From Emp Constr" + empid);
	}
	
	public Emp(String str) {
		
		System.out.println("From Emp Constr with string" + str);
	}

	public String getDetails() {
		return empid+ " -- " + empname;
	}
	
}

class Manager extends Emp{
     String dept ="IT";
     
	
	public Manager() {
		super(500);  // Used to invoke the base class constructor
		System.out.println("From Mgr Constr");
	}


	public String getDetails() {  // Overridding
		return super.getDetails()+ "--" + dept;
	}
	
}

class Salary{
	
	
}


public class InMainClass {
	public static void main(String[] args) {
		/*
		 * Emp em = new Emp(); System.out.println(em.getDetails());
		 * 
		 * Manager mgr = new Manager(); System.out.println(mgr.getDetails());
		 */
		Emp em = new Manager();
		System.out.println(em.getDetails());
		if(em instanceof Manager ) {
			System.out.println("u r manager");
		}
		else
		{
			System.out.println("u r Emp");
		}
	}
	
}






