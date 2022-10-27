package Package2.Protected;

/*
 The next access level specifier is protected which allows the class 
 itself, subclasses (with a caveat), and all classes in the same package 
 to call the method. To declare a protected method, use the keyword protected.
  For example, take this version of the Alpha class which is now declared to 
  be within a package named "Greek" and which has a single protected method 
  declared within it.
  
  
  Now, suppose that the class, Gamma, was also declared to be a member of 
  the Greek package. The Gamma class can legally call the iamprotected() 
  method declared within the Alpha class because it is within the 
  same package as Alpha.
 */

class BetaPrivateAndProtected{
	protected void iamPrivateAndProtected() {
		System.out.println("I am calling the Private And Protected Here ");
	}
}

public class AlphaPrivateAndProtected {
	
	protected void HelloprivateAndProtected() {
		System.out.println("hi You can call This one Also");
	}
	
	public static void main(String[] args) {
		BetaPrivateAndProtected b11 = new BetaPrivateAndProtected();
		b11.iamPrivateAndProtected();
		
		AlphaPrivateAndProtected a12 = new AlphaPrivateAndProtected();
		a12.HelloprivateAndProtected();
	}

}
