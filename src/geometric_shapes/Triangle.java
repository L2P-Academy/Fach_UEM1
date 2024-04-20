package geometric_shapes;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	// Constructor
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	// Getter & Setter
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// Return value
	public double calculateArea() {
		return 0.5 * base * height;
	}
}
