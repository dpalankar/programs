package example.tricky;

public interface interface1 {
	void show();
	default void show2() {
		System.out.println("show2 of A1");
	}
}
