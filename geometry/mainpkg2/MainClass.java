

package geometry.mainpkg2;

import geometry.shapes.Square;
import geometry.shapes.Triangle;
import geometry.shapes.Circle;

public class MainClass {
    public static void main(String[] args) {
        // Create Square
        Square square = new Square(5.0);
        System.out.println("Square - Side: " + square.getSide());
        System.out.println("Square - Area: " + square.calculateArea());
        System.out.println("Square - Perimeter: " + square.calculatePerimeter());

        // Create Triangle
        Triangle triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);
        System.out.println("\nTriangle - Base: " + triangle.getBase() + ", Height: " + triangle.getHeight());
        System.out.println("Triangle - Area: " + triangle.calculateArea());
        System.out.println("Triangle - Perimeter: " + triangle.calculatePerimeter());

        // Create Circle
        Circle circle = new Circle(7.0);
        System.out.println("\nCircle - Radius: " + circle.getRadius());
        System.out.println("Circle - Area: " + circle.calculateArea());
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter());
    }
}
