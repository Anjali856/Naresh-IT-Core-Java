

class Employee 
{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	

	public  Employee(int employeeId,String employeeName, double basicSalary,double HRAPer,double DAPer)
		{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		}
	public double calculateGrossSalary()
		{
			return basicSalary +HRAPer +DAPer;

		}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + "]";
	}
	
		
}
