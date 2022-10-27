package Package1;

public class StringExample {
	public static void main(String[] args) {
		String name = "hello";
		System.out.println();
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.hashCode());
		System.out.println(name.hashCode());
		System.out.println(str1.hashCode());
		
	}

}
