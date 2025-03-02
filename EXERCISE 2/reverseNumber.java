public class reverseNumber {

    public static void main(String[] args) {
                int number = 12345;
        
                int reversed = 0;

                while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reversed = reversed * 10 + digit; // Build the reversed number
            number = number / 10; // Remove the last digit from the number
        }

                System.out.println("Reversed number: " + reversed);
    }
}
