class  Manager
{
	 private int managerId;
	 private String managerName;
	 private double basicSalary;
	 private  double  HRAPer; 
	 private  double DAPerr; 
	 private  double  projectAllowance;
	 
	 
	 public Manager(int managerId, String managerName, double basicSalary, double hRAPer, double dAPerr,
			double projectAllowance) 
	 {
		
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPerr = dAPerr;
		this.projectAllowance = projectAllowance;
	 }
	 
	 public double calculateGrossSalary()
	 {
	  return  basicSalary + HRAPer + DAPerr + projectAllowance;
	 }

	 @Override
	 public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPerr=" + DAPerr + ", projectAllowance=" + projectAllowance + "]";
	 }
	 
}
