package interfacepackage;

public class InterChild implements Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterChild ch = new InterChild();
		ch.display();
		System.out.println(ch.n);

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface");
		
	}

}
