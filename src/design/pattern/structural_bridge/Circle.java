package design.pattern.structural_bridge;

public class Circle implements Shape,Color {

	protected Color color;

	public Circle(Color c) {
		this.color = c;
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

	@Override
	public void drawshape() {
		System.out.println("Draw Circle ");		
	}

}