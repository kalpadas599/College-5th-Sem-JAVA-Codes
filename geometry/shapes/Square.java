

package geometry.shapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Mutator
    public void setSide(double side) {
        this.side = side;
    }

    // Accessor
    public double getSide() {
        return side;
    }

    // Calculate Area
    public double calculateArea() {
        return side * side;
    }

    // Calculate Perimeter
    public double calculatePerimeter() {
        return 4 * side;
    }
}
