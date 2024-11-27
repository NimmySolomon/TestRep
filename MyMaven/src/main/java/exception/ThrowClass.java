package exception;

public class ThrowClass {

	public static void main(String[] args) {
		int age = 9;
		if(age>=18)
		{
			System.out.println("Eligibile for voting");
		}
		else
		{
			throw new ArithmeticException("Incorrect value");
		}

	}

}
