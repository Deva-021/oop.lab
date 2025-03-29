abstract class Room {
    protected int roomNumber;
    protected String roomType;
    protected double price;
    protected boolean isOccupied;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isOccupied = false;
    }

    public abstract void displayRoomDetails();

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

class StandardRoom extends Room {
    private int numberOfBeds;

    public StandardRoom(int roomNumber, double price, int numberOfBeds) {
        super(roomNumber, "Standard", price);
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Standard Room Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Price: $" + price);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Occupied: " + isOccupied);
    }
}

class SuiteRoom extends Room {
    private boolean hasLivingRoom;

    public SuiteRoom(int roomNumber, double price, boolean hasLivingRoom) {
        super(roomNumber, "Suite", price);
        this.hasLivingRoom = hasLivingRoom;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Suite Room Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Price: $" + price);
        System.out.println("Living Room: " + hasLivingRoom);
        System.out.println("Occupied: " + isOccupied);
    }
}

class HotelBookingSystem {
    private java.util.List<Room> rooms = new java.util.ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                room.setOccupied(true);
                System.out.println("Room " + roomNumber + " booked successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                room.displayRoomDetails();
                System.out.println("--------------------");
            }
        }
    }

    public void displayAllRooms() {
        System.out.println("All Rooms:");
        for (Room room : rooms) {
            room.displayRoomDetails();
            System.out.println("--------------------");
        }
    }
}

public class HotelBookingApp {
    public static void main(String[] args) {
        HotelBookingSystem bookingSystem = new HotelBookingSystem();

        StandardRoom room101 = new StandardRoom(101, 100.0, 2);
        SuiteRoom room201 = new SuiteRoom(201, 250.0, true);
        StandardRoom room102 = new StandardRoom(102, 120.0, 3);

        bookingSystem.addRoom(room101);
        bookingSystem.addRoom(room201);
        bookingSystem.addRoom(room102);

        bookingSystem.displayAvailableRooms();
        bookingSystem.bookRoom(101);
        bookingSystem.bookRoom(201);
        bookingSystem.bookRoom(103);
        bookingSystem.displayAllRooms();
    }
}