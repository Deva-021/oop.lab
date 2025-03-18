class Shape {

    // Method to calculate area
    public double calculateArea(double length, double width) {
        // Rectangle area calculation
        return length * width;
    }

    public double calculateArea(double radius) {
        // Circle area calculation
        return 3.14 * radius * radius;
    }

    // Method to calculate perimeter
    public double calculatePerimeter(double length, double width) {
        // Rectangle perimeter calculation
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius) {
        // Circle perimeter calculation
        return 2 * 3.14 * radius;
    }
}

public class Overloading2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // ExtraShape calculation (Rectangle + Circle)
        double rectLength = 4, rectWidth = 5, circleRadius = 3;
        double extraShapeArea = shape.calculateArea(rectLength, rectWidth) + shape.calculateArea(circleRadius);
        double extraShapePerimeter = shape.calculatePerimeter(rectLength, rectWidth) + shape.calculatePerimeter(circleRadius);

        System.out.println("Extra Shape Area: " + extraShapeArea);
        System.out.println("Extra Shape Perimeter: " + extraShapePerimeter);

        // Rectangle calculation
        System.out.println("Rectangle Area: " + shape.calculateArea(rectLength, rectWidth));
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter(rectLength, rectWidth));

        // Circle calculation
        System.out.println("Circle Area: " + shape.calculateArea(circleRadius));
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter(circleRadius));
    }
}
