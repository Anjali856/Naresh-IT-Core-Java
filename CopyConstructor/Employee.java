package com.exam.blc;

public class Employee {
 private int employeeId;
 private String employeeName;
 private int DaysWorked;
 public Employee(int employeeId, String employeeName, int daysWorked) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	DaysWorked = daysWorked;
 }
 // copy constructor
 public Employee(Employee e) {
	 this.employeeId=e.employeeId;
	 this.employeeName=e.employeeName;
	 this.DaysWorked=e.DaysWorked;
 }
 public int getEmployeeId() {
	return employeeId;
 }
 public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
 }
 public String getEmployeeName() {
	return employeeName;
 }
 public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
 }
 public int getDaysWorked() {
	return DaysWorked;
 }
 public void setDaysWorked(int daysWorked) {
	DaysWorked = daysWorked;
 }
public boolean isEfficient() {
	int c=0;
	for(int i=2;i<this.DaysWorked;i++) {
		if(this.DaysWorked%i==0) {
			c++;
		}
	}
	
	if(c==0) {
		return true;
	}
	else {
		return false;
		
	}
	
	
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", DaysWorked=" + DaysWorked + "]";
}
 
}
