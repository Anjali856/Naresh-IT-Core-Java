public class Trainer {
 private int trainerId;
 private String trainerName ;
 private double basicSalary;
 private double HRAPer;
 private double DAPer ;
 private int batchCount;
 private double perkPerBatch;
 
 public Trainer(int trainerId, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
		double perkPerBatch) {
	super();
	this.trainerId = trainerId;
	this.trainerName = trainerName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.batchCount = batchCount;
	this.perkPerBatch = perkPerBatch;
 }
  
 public double calculateGrossSalary()
 {
	 return  basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
 }

 @Override
 public String toString() {
	return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", basicSalary=" + basicSalary
			+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", batchCount=" + batchCount + ", perkPerBatch="
			+ perkPerBatch + "]";
 }
 
}
