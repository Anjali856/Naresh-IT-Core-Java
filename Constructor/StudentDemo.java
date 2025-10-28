import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Name:");
		String name=sc.next();
		
		System.out.println("Attendence:");
		double Attendence=Double.parseDouble(sc.next());
		
		System.out.println("Exam Marks:");
		double marks=Double.parseDouble(sc.next());
		
		System.out.println("Lab Performance:");
		double labPerformance=Double.parseDouble(sc.next());
		
		System.out.println("Daily Task:");
		double dailyTask=Double.parseDouble(sc.next());
		
		Student s = new Student(name, Attendence, marks, labPerformance, dailyTask);
		System.out.println(s);
		System.out.println("Overall Percentage:"+s.calculateMarks());
		System.out.println("Grade:"+s.calculateGrade());
		System.out.println("Promotion Eligibility:"+s.calculatePercentage());
		
    sc.close();
	}

}
