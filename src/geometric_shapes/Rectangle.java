package geometric_shapes;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	// Constructor	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	// Getter & Setter
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	// Return value
	public double calculateArea() {
        return length * width;
    }
	
	// Method to draw a rectangle in the console
    public void drawRectangle() {
        for (int i = 0; i < width; i++) {
            System.out.print("_ ");
        }
        System.out.println();

        for (int i = 0; i < length - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < width * 2 - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("_ ");
        }
        System.out.println();
    }
}