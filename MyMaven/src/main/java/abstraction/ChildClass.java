package abstraction;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass ch = new ChildClass();
		ch.view();
		ch.show();

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("Abstract");
		
	}

}
