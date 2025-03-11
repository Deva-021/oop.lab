public class FindAvg {
    public int findAvg(int numA, int numB, int numC) {
        int deva = (numA + numB + numC) / 3;          return deva;
    }

    public static void main(String args[]) {
        FindAvg obj = new FindAvg();
        int avg = obj.findAvg(10, 20, 30);
        System.out.println("Average of 10, 20 and 30 is: " + avg);
    }
}
