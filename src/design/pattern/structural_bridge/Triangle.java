package design.pattern.structural_bridge;

public class Triangle implements Shape,Color {

	protected Color color;

	public Triangle(Color c) {
		this.color = c;
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

	@Override
	public void drawshape() {
		System.out.println("Draw Triangle ");		
	}

}