A company maintains an instance variable salary for its employees. 
However, inside a method setSalary(), a local variable with the same name is 
used. Your task is to correctly print both the local and non-static salary values.

Requirements:
- Create a class Employee with an instance variable int salary = 50000.
- Implement a method setSalary(int salary), where the method parameter has the
same name as the instance variable.
- Inside the method, print both the local variable salary and the instance variable
using this.salary.

Create an Employee object in main(), call setSalary(60000), and check the output.
Examples
Output

Local Salary: 60000
Instance Salary: 50000
  Solution-:
  class Employee {
    int salary = 50000;

    void setSalary(int salary) {
        System.out.println("Local Salary: " + salary);
        System.out.println("Instance Salary: " + this.salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(60000);
    }
}
