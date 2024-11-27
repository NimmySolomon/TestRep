package exception;

public class ExcepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int m = 0;
		
		try
		{
			int div = n/m;
		}
		catch(ArithmeticException ae)
		{
			 // System.out.println("Exception Handled");
			m = 2;
			int d= n/m;
			System.out.println(d);
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Rest of the code");
		}

	}

}
