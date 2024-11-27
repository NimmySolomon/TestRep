package abstraction;

public class AbstractChild extends Abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild abchild = new AbstractChild();
		abchild.show();
		abchild.add(2,19);
		

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Abstraction");
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		System.out.println("Sum : "+sum);
		
	}



}
