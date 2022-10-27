package Package2.Private;

/*Let's begin with the most restrictive access level--private. 
 * Only the class in which a private method is defined can call that method.
 *  To declare a private method, use the keyword private. For example, 
 *  the following class defines one private method within it:

Objects of type Alpha can call the iamprivate() method,
 but objects of other types cannot. For example, the following class, 
 regardless of which package it is in or its parentage, cannot call 
 the iamprivate() method within the Alpha class.


*/

class Beta{
	
	private void iamPrivate() {
		System.out.println("I am calling private here");
	}
}

public class Alpha {
	
	private void Hello() {
		System.out.println("I am calling hello private () here");
	}
	
	public static void main(String[] args) {
		Beta b1 = new Beta();
		Alpha a11 = new Alpha();
		a11.Hello(); // You can Call Here if you are making the function inside the Public Class Files
//		b1.iamPrivate(); //Illegal to call here because it is private ()
	}

}
