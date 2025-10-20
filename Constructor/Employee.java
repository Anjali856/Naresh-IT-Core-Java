package com.constructor.oct_16;

//BLC
public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int NoOfProject;

	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
	}

	public void calculateSalary() {
		if (NoOfProject < 0) {
			System.out.println("Number of projects cannot be negative");
			System.out.println("Salary remains"+salary);
			System.exit(0);
		}

		else if (NoOfProject >= 5 && NoOfProject <= 10) {
			this.salary += 5000;

		} else if (NoOfProject >= 10 && NoOfProject <= 20) {
			this.salary += 10000;

		} else {
			this.salary += 15000;

		}

		System.out.println("Updated Salary : " + salary);

	}

	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}

}
