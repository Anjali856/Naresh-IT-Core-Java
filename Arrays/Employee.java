import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many object you want to create :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			System.out.println("Enter name ");
			String name=sc.next();
			System.out.println("Enter Salary : ");
			double sal=sc.nextDouble();
			Employee[] e= {new Employee(id, name, sal)};
			for(Employee e1:e) {
				System.out.println(e1);
			}
		}
		
	}

	}

}
