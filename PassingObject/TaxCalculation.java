import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e=new Employee(101, "vghk", 60000, 2000, 10000);
		TaxUtil t=new TaxUtil();
		System.out.println(e);
		System.out.println(t.calculateTax(e));
		
		Manager m = new Manager(102, "Ravi", 50000, 5000, 2000, 10);
		 TaxUtil t1= new TaxUtil();
		 System.out.println(m);
	     System.out.println(t1.calculateTax(m));
	     
	     Trainer t2= new Trainer(1000, "Rahul", 30000, 1000, 500, 10, 5);
	     TaxUtil t3= new TaxUtil();
	     System.out.println(t2);
	     System.out.println(t3.calculateTax(t2));
	}

}
