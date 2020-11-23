package hijava.practice;

public class Num {

	public static void main(String[] args) {
//		byte b = 1;
//		short s = 1;
//		int i = 1;
//		long i = 1;
//		
//		System.out.println(Integer.MAX_VALUE);
//		
		char c = 'A';		// cf. char c = 65;    or  char c = '\uD55C';
		byte b = 'A';
		System.out.println(c);
		System.out.println( (int)c );    // cf. (char)c  or   (char)b
		
		System.out.println(b);
		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		
		System.out.println("ABÇÑ".getBytes().length);
		System.out.println("hi");
		
	}

}
