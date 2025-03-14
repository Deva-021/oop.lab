class Person{
String name;
int age;
public Person(String name, int age){
this.name= name;
this.age= age;
}
}
class Student extends Person{
int studentID;
String course;
public Student(String name, int age, int studentID, String course){
super(name, age);
this.studentID= studentID;
this.course=course;
}
}
class Graduatestudent extends Student{
int graduationyear;
public Graduatestudent(String name, int age, int studentID, String course, int graduationyear){
super(name, age, studentID, course);
this.graduationyear=graduationyear;
}
}
public class Multilevelinheritance1{
public static void main(String[]args){
Graduatestudent get=new Graduatestudent("deva", 22, 24021, "cse", 2028);
System.out.println("Name:"+get.name);
System.out.println("Age:"+get.age);
System.out.println("Student ID:"+get.studentID);
System.out.println("Course:"+get.course);
System.out.println("Graduation year:"+get.graduationyear);
}
}


