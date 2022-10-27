package Package2;

public class Alpha {
	
	private void iamprivate() {
		System.out.println("I am calling the private function");
	}
	
	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		a1.iamprivate();
	}

}
