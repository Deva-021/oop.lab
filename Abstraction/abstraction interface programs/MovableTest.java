interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Car implements Movable {
    private int x;
    private int y;

    public Car(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    @Override
    public void moveUp() {
        y++;
        System.out.println("Car moved up to (" + x + ", " + y + ")");
    }

    @Override
    public void moveDown() {
        y--;
        System.out.println("Car moved down to (" + x + ", " + y + ")");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println("Car moved left to (" + x + ", " + y + ")");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println("Car moved right to (" + x + ", " + y + ")");
    }
}

class Point implements Movable {
    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    @Override
    public void moveUp() {
        y++;
        System.out.println("Point moved up to (" + x + ", " + y + ")");
    }

    @Override
    public void moveDown() {
        y--;
        System.out.println("Point moved down to (" + x + ", " + y + ")");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println("Point moved left to (" + x + ", " + y + ")");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println("Point moved right to (" + x + ", " + y + ")");
    }
}

public class MovableTest {
    public static void main(String[] args) {
        Car myCar = new Car(10, 20);
        myCar.moveUp();
        myCar.moveRight();

        Point myPoint = new Point(5, 8);
        myPoint.moveDown();
        myPoint.moveLeft();
    }
}