package abstraction;

public class AbstractChildClass extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ach = new AbstractChildClass();  //parent reference created
		ach.show();
		ach.print();
		//ach.view(); // can't call child class instance method using the reference created

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Child Class");
		
	}
	public void view() {
		System.out.println("Abstract");
	}

}
