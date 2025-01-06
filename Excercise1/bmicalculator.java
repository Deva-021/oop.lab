public class bmicalculator {

    // Method to calculate BMI
    public static float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        // Hardcoded values for weight (in kilograms) and height (in meters)
        float weight = 70;   // Example weight in kilograms
        float height = 1.75f; // Example height in meters

        // Calculate the BMI
        float bmi = calculateBMI(weight, height);

        // Display the BMI result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Directly print the BMI category
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
