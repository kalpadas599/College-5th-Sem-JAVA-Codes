

package geometry.shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Mutator
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Accessor
    public double getRadius() {
        return radius;
    }

    // Calculate Area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate Perimeter (Circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
