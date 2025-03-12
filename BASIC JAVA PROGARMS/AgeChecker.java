import java.util.Scanner;

public class AgeChecker {


    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
               System.out.print("Enter your age: ");
        int age=input.nextInt();


        
                if (age >= 0 && age <= 12) {
            System.out.println("your are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("you are  Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("you  are a Adult");
        } else if (age >= 60 && age <=100) {
            System.out.println("you  are a Senior");
        } else {
            System.out.println("Invalid age entered.");
        }
                 
                



    }
}