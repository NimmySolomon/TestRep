package AccessSpecifierTest;

import AccessSpecifier.AccessSpecifier; //import class from another package
import AccessSpecifier.Sample;

public class AccessSpecifierPackage extends AccessSpecifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierPackage asp = new AccessSpecifierPackage();
		//asp.privatemethod();  //private method can't be accessible from another package
		//asp.defaultmethod();  //default method can't be accessible from another package
		asp.protectedmethod();
		asp.publicmethod();

	}

}
