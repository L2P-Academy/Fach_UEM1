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
	
	// Method to draw a triangle in the console
    public void drawTriangle() {
        int triangleBase = (int) base;
        for (int i = 0; i < triangleBase; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}