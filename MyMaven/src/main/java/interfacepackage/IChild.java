package interfacepackage;

public class IChild implements IParent{

	public static void main(String[] args) {
		
		IParent ip = new IChild();
		ip.show();
		//ip.view();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Reference");
		
	}
	
	public void view() {
		System.out.println("View Child");
	}

}
