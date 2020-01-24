package design.pattern.structural_bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.drawshape();
		tri.applyColor();

		System.out.println("---------------------------------------");
		
		Shape circle = new Circle(new GreenColor());
		circle.drawshape();
		circle.applyColor();
	}

}