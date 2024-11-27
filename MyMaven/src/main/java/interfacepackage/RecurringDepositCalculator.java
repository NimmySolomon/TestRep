package interfacepackage;

public class RecurringDepositCalculator {
	    public static void main(String[] args) {
	        HDFC hdfcBank = new HDFC();
	        double depositAmount = 5000;
	        int durationInYears = 3;   
	        double maturityAmount = hdfcBank.recurringDeposit(depositAmount, durationInYears);
	                System.out.println("Deposit amount : "+depositAmount);
	                System.out.println("Duration : "+durationInYears+" years");
	                System.out.println("Maturity amount : "+maturityAmount);
	    }
}