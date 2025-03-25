class Room {
    String roomNumber;
    double price;

    Room(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    double calculateTotal(int days) {
        return price * days;
    }

    void displayDetails(int days) {
        System.out.println("Room: " + roomNumber + ", Total: " + calculateTotal(days));
    }
}

class SuiteRoom extends Room {
    SuiteRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

   
    double calculateTotal(int days) {
        return super.calculateTotal(days) * 1.15;
    }

    
    void displayDetails(int days) {
        System.out.println("Suite Room: " + roomNumber + ", Total: " + calculateTotal(days));
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Room standardRoom = new Room("101", 100.0);
        SuiteRoom suite = new SuiteRoom("201", 200.0);

        standardRoom.displayDetails(3);
        suite.displayDetails(3);
    }
}