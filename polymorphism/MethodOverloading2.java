class Shape {
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius) {
        return 2 * 3.14 * radius;
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        double rectLength = 4, rectWidth = 5, circleRadius = 3;
        double extraShapeArea = shape.calculateArea(rectLength, rectWidth) + shape.calculateArea(circleRadius);
        double extraShapePerimeter = shape.calculatePerimeter(rectLength, rectWidth) + shape.calculatePerimeter(circleRadius);

        System.out.println("Extra Shape Area: " + extraShapeArea);
        System.out.println("Extra Shape Perimeter: " + extraShapePerimeter);

        System.out.println("Rectangle Area: " + shape.calculateArea(rectLength, rectWidth));
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter(rectLength, rectWidth));

        System.out.println("Circle Area: " + shape.calculateArea(circleRadius));
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter(circleRadius));
    }
}