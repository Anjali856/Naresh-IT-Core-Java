
package com.constructor.factory_method_22oct;
//BLC
public class Student {
	private String name;
	private int age;
	private String grade;
	public Student(String name, int age, String grade) {
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	// Static factory method
	 public static Student createStudentObject(String name, int age,String grade) {
		 return new Student(name,age,grade);
	
	 }
	
	 public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	 }
	 
	
	

}
