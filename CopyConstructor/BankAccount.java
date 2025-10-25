class BankAccount {
    
    private String accountHolderName;
    private double principalAmount;
    private double timeInMonths;
    private double interestRate;
    private double finalAmount;

    
    public BankAccount(String accountHolderName, double principalAmount, double timeInMonths) {
        this.accountHolderName = accountHolderName;
        this.principalAmount = principalAmount;
        this.timeInMonths = timeInMonths;
        this.interestRate = determineInterestRate(timeInMonths);
        this.finalAmount = 0; 
    }

    
    public BankAccount(BankAccount original) {
        this.accountHolderName = original.accountHolderName;
        this.principalAmount = original.principalAmount;
        this.timeInMonths = original.timeInMonths;
        this.interestRate = original.interestRate;
        double interest = calculateInterest();
        this.finalAmount = principalAmount + interest;
    }

   
    private double determineInterestRate(double time) {
        if (time <= 1.0) {
            return 20.0;
        } else if (time <= 1.5) {
            return 22.0;
        } else {
            return 25.0;
        }
    }

    public double calculateInterest() {
        return (principalAmount * interestRate * timeInMonths) / 100.0;
    }

    
    public double getFinalAmount() {
        return finalAmount;
    }

    @Override
    public String toString() {
        return "Account Holder : " + accountHolderName + "\n" +
               "Principal Amount : " + principalAmount + "\n" +
               "Time (in months) : " + timeInMonths + "\n" +
               "Interest Rate : " + interestRate + "%";
    }
}
