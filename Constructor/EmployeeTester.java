package com.constructor.oct_16;

import java.util.Scanner;

//ELC
public class EmployeeTester {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter First name:");
	 String firstName=sc.next();
	 System.out.println("Enter Last name:");
	 String lastName=sc.next();
	 System.out.println("Enter your employee id:");
	  int employeeId=sc.nextInt();
	  System.out.println("Enter your salary:");
	  double salary= Double.parseDouble(sc.next());
	  System.out.println("Enter your project No:");
	  int NoOfProject=sc.nextInt();
	 
	  Employee e= new Employee(firstName,lastName,employeeId,salary,NoOfProject);
	  System.out.println(e);
	  e.calculateSalary();
	  

	}

}
