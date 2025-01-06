public class bmicalculator{

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to interpret BMI
    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "You are underweight.";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "You have a normal weight.";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "You are overweight.";
        } else {
            return "You are obese.";
        }
    }

    public static void main(String[] args) {
        // Hardcoded values for weight (in kilograms) and height (in meters)
        double weight = 70;   // Example weight in kilograms
        double height = 1.75; // Example height in meters

        // Calculate the BMI
        double bmi = calculateBMI(weight, height);

        // Display the BMI result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Interpret the BMI result
        String interpretation = interpretBMI(bmi);
        System.out.println(interpretation);
    }
}
