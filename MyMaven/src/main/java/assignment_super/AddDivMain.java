package assignment_super;

public class AddDivMain {
    public static void main(String[] args) {
        DivisibilityCheck obj = new DivisibilityCheck();
        int number1 = 19;
        int number2 = 21;
        
        System.out.println(number1+" + "+number2+" = "+(number1+number2));
        if (obj.isDivisibleBy10(number1, number2)) {
            System.out.println("The addition result is divisible by 10.");
        } else {
            System.out.println("The addition result is not divisible by 10.");
        }
    }
}