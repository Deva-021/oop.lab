class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and 200 km/h.");
        }
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            setSpeed(speed + amount);
            System.out.println("Car accelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid acceleration value!");
        }
    }

    public void decelerate(int amount) {
        if (amount > 0) {
            setSpeed(speed - amount);
            System.out.println("Car decelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid deceleration value!");
        }
    }
}

public class Speedsystem {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.accelerate(50);
        myCar.accelerate(160);
        myCar.decelerate(30);
        myCar.setSpeed(250);
        myCar.setSpeed(120);
        System.out.println("Final Speed: " + myCar.getSpeed() + " km/h");
    }
}
