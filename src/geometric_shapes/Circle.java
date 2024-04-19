package geometric_shapes;

public class Circle extends Shape {
	private double radius;
	
	// Constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// Getter & Setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Return value
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
