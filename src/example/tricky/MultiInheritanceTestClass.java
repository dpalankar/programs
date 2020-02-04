package example.tricky;

/* 
 * case 1 Multiple inheritance failing.
 * case 2 Solution(Adjustment) to case1
 */

public class MultiInheritanceTestClass implements interface1,interface2{
	
	public static void main(String[] args) {
		System.out.println("Main1");
		MultiInheritanceTestClass obj = new MultiInheritanceTestClass();
		obj.show();
		//case 1 need to override show2 because default show2 method are present in both interface
		obj.show2();
		//no need to override show3 
		obj.show3();
	}

	public void show() {
		System.out.println("show");
	}

	
	//case2
	@Override
	public void show2() {
		interface1.super.show2();
	}
}
