import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
