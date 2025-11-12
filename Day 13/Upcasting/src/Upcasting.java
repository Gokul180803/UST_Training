import java.util.ArrayList;

// Step 1: Define Base Class
abstract class Shape {
    abstract void draw();

    String getAreaDescription() {
        return "Area is not specified for a generic shape.";
    }
}

// Step 2: Define Derived Classes
class Circle extends Shape {
    int radius = 5;

    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    int getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 4;

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    int getLength() {
        return length;
    }

    int getWidth() {
        return width;
    }
}

// Step 3 & 4: Main Class
public class Upcasting {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());     // Upcasted to Shape
        shapes.add(new Rectangle());  // Upcasted to Shape

        for (Shape shape : shapes) {
            shape.draw(); 
            System.out.println(shape.getAreaDescription());

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;  // Downcast
                System.out.println("This is a Circle with radius: " + c.getRadius());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;  // Downcast
                System.out.println("This is a Rectangle with length: " + r.getLength() +
                                   " and width: " + r.getWidth());
            }

            System.out.println();
        }
    }
}
