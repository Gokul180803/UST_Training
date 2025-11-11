// Shape interface
interface Shape {
    int getArea();
}

// Rectangle class
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() {
        return width * height;
    }
}

// Square class
class Square implements Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    @Override
    public int getArea() {
        return size * size;
    }
}
public class InheritancePitfalls {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 6);
        Shape square = new Square(5);

        System.out.println("Rectangle Area: " + rect.getArea()); // 24
        System.out.println("Square Area: " + square.getArea());  // 25
    }
}

