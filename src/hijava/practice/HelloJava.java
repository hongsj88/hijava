package hijava.practice;

public class HelloJava {
	String message = "Hello Java!!";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloJava.say("Hi!");
		HelloJava hj = new HelloJava();
		System.out.println(hj.message);
	}
	public static void say(String msg){
		
		System.out.println(msg);		
	}

}
