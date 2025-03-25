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

    public double calculateCombinedArea(double rectLength, double rectWidth, double circleRadius) {
        return calculateArea(rectLength, rectWidth) + calculateArea(circleRadius);
    }

    public double calculateCombinedPerimeter(double rectLength, double rectWidth, double circleRadius) {
        return calculatePerimeter(rectLength, rectWidth) + calculatePerimeter(circleRadius);
    }

    public void displayCombinedDetails(double rectLength, double rectWidth, double circleRadius) {
        System.out.println("Combined Shape Area: " + calculateCombinedArea(rectLength, rectWidth, circleRadius));
        System.out.println("Combined Shape Perimeter: " + calculateCombinedPerimeter(rectLength, rectWidth, circleRadius));
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.displayCombinedDetails(4, 5, 3);

        double rectLength = 4;
        double rectWidth = 5;
        double circleRadius = 3;

        System.out.println("Rectangle Area: " + shape.calculateArea(rectLength, rectWidth));
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter(rectLength, rectWidth));

        System.out.println("Circle Area: " + shape.calculateArea(circleRadius));
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter(circleRadius));
    }
}