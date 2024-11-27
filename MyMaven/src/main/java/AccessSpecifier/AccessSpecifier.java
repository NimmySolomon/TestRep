package AccessSpecifier;

public class AccessSpecifier {
	private void privatemethod()
	{
		System.out.println("Private Access Specifier");
	}
	public void publicmethod()
	{
		System.out.println("Public Access Specifier");
	}
	protected void protectedmethod()
	{
		System.out.println("protected Access Specifier");
	}
	void defaultmethod()
	{
		System.out.println("Default Access Specifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier as = new AccessSpecifier();
		//as.privatemthod();
		as.publicmethod();
		as.protectedmethod();
		as.defaultmethod();

	}

}
