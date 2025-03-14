class Shape{
double length;
double width;
double radius;
public  Shape(double length, double width, double radius){
this.length=length;
this.width=width;
this.radius=radius;
}
}
class Rectangle extends Shape{
public  Rectangle(double length, double width){
super(length, width, 0);
}

public double calculateArea(){
return length * width;
}
public double calculatePerimeter(){
return 2 * (length+width);
}
}
class Circle extends Shape{


public  Circle(double radius){
super(0, 0, radius);
}

public double calculateArea(){
return 3.14 * radius * radius;
}
public double calculatePerimeter(){
return 2 * 3.14 * radius;
}
}
public class hierarchicalinheritance1{
public static void main(String[]args){
 Rectangle rect = new Rectangle(4, 5);
 System.out.println("Rectangle Area: " + rect.calculateArea());          
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());  
Circle circle = new Circle(3);
System.out.println("Circle Area: " + circle.calculateArea());           
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());  
    }
}
