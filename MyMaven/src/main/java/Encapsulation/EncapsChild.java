package Encapsulation;

public class EncapsChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsParent p = new EncapsParent();
		p.setName("ABC");;
		p.setAge(19);
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
