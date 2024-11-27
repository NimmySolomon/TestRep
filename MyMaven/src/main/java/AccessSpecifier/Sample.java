package AccessSpecifier;

public class Sample extends AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		// s.privatemethod();  private method can't be accessible from another class
		s.defaultmethod();
		s.protectedmethod();
		s.publicmethod();

	}

}
