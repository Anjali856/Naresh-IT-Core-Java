package com.exam.elc;

import java.util.Scanner;

import com.exam.blc.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		int id =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee Days Of working :");
		int days=Integer.parseInt(sc.nextLine());
		
		Employee e=new Employee(id, name, days);
        System.out.println(e);
       System.out.println("Is Efficient: "+e.isEfficient());
       
       sc.close();
	}

}
