package assignment_super;

public class DivisibilityCheck extends Addition {
    public boolean isDivisibleBy10(int num1, int num2) {
        int sum = super.addNumbers(num1, num2); 
        return sum % 10 == 0;
    }
}


