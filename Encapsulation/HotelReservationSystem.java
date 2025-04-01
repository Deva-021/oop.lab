class Room {
    private int roomID;
    private String roomType;
    private double price;
    private boolean availabilityStatus;

    public Room(int roomID, String roomType, double price, boolean availabilityStatus) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public boolean reserveRoom() {
        if (availabilityStatus) {
            availabilityStatus = false;
            return true;
        }
        return false;
    }

    public void cancelReservation() {
        availabilityStatus = true;
    }
}

class Reservation {
    private int reservationID;
    private String customerName;
    private Room room;
    private String checkInDate;

    public Reservation(int reservationID, String customerName, Room room, String checkInDate) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.room = room;
        this.checkInDate = checkInDate;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public boolean reserve() {
        if (room.reserveRoom()) {
            System.out.println("Reservation successful for " + customerName + " on " + checkInDate);
            return true;
        }
        System.out.println("Room not available for reservation.");
        return false;
    }

    public void cancel() {
        room.cancelReservation();
        System.out.println("Reservation canceled for " + customerName);
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", 100.0, true);
        Room room2 = new Room(102, "Double", 150.0, true);

        Reservation reservation1 = new Reservation(1, "John Doe", room1, "2025-04-15");
        Reservation reservation2 = new Reservation(2, "Jane Smith", room2, "2025-04-16");

        reservation1.reserve();
        reservation2.reserve();
        reservation1.cancel();
    }
}
