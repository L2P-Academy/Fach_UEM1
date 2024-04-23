package geometric_shapes;

public class Pentagon extends Shape {
    private double side;

    // Constructor
    public Pentagon(double side) {
		super();
		this.side = side;
	}

    // Getter & Setter
    public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Return value
	public double calculateArea() {
        return (5.0 / 4.0) * Math.pow(side, 2) * (1 / Math.tan(Math.PI / 5));
    }
}