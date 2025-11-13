import java.util.*;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Circle(3.5));

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.printf("Circle with radius: %.1f, Area: %.14f%n", c.getRadius(), c.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.printf("Rectangle with width: %.1f, height: %.1f, Area: %.1f%n",
                                  r.getWidth(), r.getHeight(), r.getArea());
            }
        }
        
        
        
        
        
        
        
        
//        Circle with radius: 5.0, Area: 78.53981633974483
//        Rectangle with width: 4.0, height: 6.0, Area: 24.0
//        Circle with radius: 3.5, Area: 38.48451000647496
    }
}
