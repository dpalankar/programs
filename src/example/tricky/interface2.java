package example.tricky;

public interface interface2 {
	void show();
	
	default void show2() {
		System.out.println("show2 of A2");
	}
	
	default void show3() {
		System.out.println("show3 of A2");
	}
}
