package geometric_shapes;

public class Octagon extends Shape {
    private double side;

    // Constructor
    public Octagon(double side) {
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
        return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }
}