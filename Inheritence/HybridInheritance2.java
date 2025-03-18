interface AreaCalculable {
    double calculateArea();
}

interface PerimeterCalculable {
    double calculatePerimeter();
}

class Shape {
    double length;
    double width;
    double radius;

    public Shape(double length, double width, double radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
}

class Rectangle extends Shape implements AreaCalculable, PerimeterCalculable {

    public Rectangle(double length, double width) {
        super(length, width, 0);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape implements AreaCalculable, PerimeterCalculable {

    public Circle(double radius) {
        super(0, 0, radius);
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class ExtraShape implements AreaCalculable, PerimeterCalculable {
    private Rectangle rectangle;
    private Circle circle;

    public ExtraShape(double length, double width, double radius) {
        rectangle = new Rectangle(length, width);
        circle = new Circle(radius);
    }

    @Override
    public double calculateArea() {
        return rectangle.calculateArea() + circle.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return rectangle.calculatePerimeter() + circle.calculatePerimeter();
    }
}

public class HybridInheritance2 {
    public static void main(String[] args) {
        ExtraShape extra = new ExtraShape(4, 5, 3);
        System.out.println("Extra Shape Area: " + extra.calculateArea());
        System.out.println("Extra Shape Perimeter: " + extra.calculatePerimeter());

        Rectangle rect = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
