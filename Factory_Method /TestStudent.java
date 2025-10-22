package com.constructor.factory_method_22oct;
//ELC
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter your age :");
			int age=Integer.parseInt(sc.next());
			System.out.println("Enter your garde:");
			String grade=sc.next();
			sc.nextLine();
			Student s=Student.createStudentObject(name, age, grade);
			System.out.println(s);
			System.out.println("Do You want to continue yes/no");
			String choice=sc.nextLine();
			if(choice.equalsIgnoreCase("no")) {
				break;
			}
		}
	
	}

}
