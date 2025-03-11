public class bmicalculator {

       public static float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        height (in meters)
        float weight = 70;   
        float height = 1.75f; 
        float bmi = calculateBMI(weight, height);

                System.out.printf("Your BMI is: %.2f\n", bmi);

        
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
