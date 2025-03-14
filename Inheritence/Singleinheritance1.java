class room{
  double length;
  double width;  

public  room(double length, double width){
    this.length=length;
    this.width=width;
}
 public double calculateArea(){
return length*width;
}
}
class roomVolume extends room{
double height;
 
public roomVolume(double length, double width, double height){
super(length, width);
this.height=height;
}
public double calculateVolume(){
return   calculateArea()*height;
}
}
public class Singleinheritance1{
public static void  main(String[] args){
roomVolume Room= new roomVolume(10, 20, 30);
 
double area = Room.calculateArea();
System.out.println("Area of the room is "  +area + "square.units");   

double volume = Room.calculateVolume();
System.out.println("Volume of the room is "  +volume + "cubic.units");  
}
}   