package Package2.Public;

/*
 Now for the easiest access specifier--public. 
 Any class, in any package, can call a class's public methods. 
 To declare a public method, use the keyword public. For example,
 
 Now, let's go back to our Beta class which is now in a different 
 package than Alpha and is completely unrelated to Alpha (not a subclass of).
 */

class Alpha{
	public void iamPublic() {
		System.out.println("I Am Calling here the public function");
	}
}
public class PublicClassExample {
	
	public void HelloPublic() {
		System.out.println("I am calling the Public Hello() here");
	}
	public static void main(String[] args) {
		
		Alpha a23 = new Alpha();
		a23.iamPublic();
		
	PublicClassExample c1 = new PublicClassExample();
	c1.HelloPublic();
		
	}

}
