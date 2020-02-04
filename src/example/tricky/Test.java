package example.tricky;
public class Test {

	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
	public static void main(String args[]){
		Test obj = null;
		System.out.println(obj.foo());
	}
}