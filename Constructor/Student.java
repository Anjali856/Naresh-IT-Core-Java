public class Student {
	private String name;
	private double Attendance;
	private double ExamMarks;
	private double labPerformance;
	private double DailyTask;
	public Student(String name, double attendance, double examMarks, double labPerformance, double dailyTask) {
		super();
		this.name = name;
		Attendance = attendance;
		ExamMarks = examMarks;
		this.labPerformance = labPerformance;
		DailyTask = dailyTask;
	}
	public String calculateGrade() {
		if(ExamMarks>=90) {
			return "A+";
		}
		
		else if(ExamMarks>=80) {
			return "A";
		}
		else if(ExamMarks>=70) {
			return "B";
		}
		else if(ExamMarks>=60) {
			return "C";
		}
		else {
			return "Fail";
		}	
	}
	
  public double calculateMarks() {
	  return (Attendance+ExamMarks+labPerformance+DailyTask)*100/400;
  }
	public String calculatePercentage() {
		 double  percentage = 0;
		 if(percentage>=60) {
			 return " Eligible ";
		 }
		 else {
			 return "Not Eligible";
		 }
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Attendance=" + Attendance + ", ExamMarks=" + ExamMarks + ", labPerformance="
				+ labPerformance + ", DailyTask=" + DailyTask + "]";
	}
	
  
}
