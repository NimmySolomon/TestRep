package interfacepackage;

public class HDFC implements RBI {
    public double recurringDeposit(double amount, int durationInYears) {
        double monthlyInterestRate = INTEREST_RATE / (12 * 100); 
        int months = durationInYears * 12; 
        double maturityAmount = amount * (Math.pow(1 + monthlyInterestRate, months) - 1) / monthlyInterestRate;
        return maturityAmount;
    }
}

