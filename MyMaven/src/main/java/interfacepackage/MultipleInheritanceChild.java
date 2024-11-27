package interfacepackage;

public class MultipleInheritanceChild implements MultipleInheritance1,MultipleInheritance2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceChild ch = new MultipleInheritanceChild();	
		ch.print();
		ch.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritance2");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritance1");
		
	}

}
