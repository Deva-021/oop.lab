class Shape {
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

class ExtraShape {
    private double rectLength;
    private double rectWidth;
    private double circleRadius;
    private Shape shape;

    public ExtraShape(double rectLength, double rectWidth, double circleRadius) {
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
        this.circleRadius = circleRadius;
        this.shape = new Shape();
    }

    public double calculateArea() {
        return shape.calculateArea(rectLength, rectWidth) + shape.calculateArea(circleRadius);
    }

    public double calculatePerimeter() {
        return shape.calculatePerimeter(rectLength, rectWidth) + shape.calculatePerimeter(circleRadius);
    }

    public void displayDetails() {
        System.out.println("Extra Shape Area: " + calculateArea());
        System.out.println("Extra Shape Perimeter: " + calculatePerimeter());
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        ExtraShape extraShape = new ExtraShape(4, 5, 3);
        extraShape.displayDetails();

        Shape shape = new Shape();
        double rectLength = 4;
        double rectWidth = 5;
        double circleRadius = 3;

        System.out.println("Rectangle Area: " + shape.calculateArea(rectLength, rectWidth));
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter(rectLength, rectWidth));

        System.out.println("Circle Area: " + shape.calculateArea(circleRadius));
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter(circleRadius));
    }
}