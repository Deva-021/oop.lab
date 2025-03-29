interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static double getPi() {
        return Math.PI;
    }
}

class MathOperations implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        MathOperations calc = new MathOperations();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(6, 7));
        System.out.println("Pi: " + Calculator.getPi());
    }
}