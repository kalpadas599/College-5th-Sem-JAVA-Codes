

package geometry.shapes;

public class Triangle {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Mutators
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSides(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessors
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Calculate Area
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Calculate Perimeter
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
