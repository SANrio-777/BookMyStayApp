abstract class Room {
    protected int beds;
    protected double price;
    protected String size;

    public Room(int beds, double price, String size) {
        this.beds = beds;
        this.price = price;
        this.size = size;
    }

    public abstract String getRoomType();

    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size);
        System.out.println("Price per night: $" + price);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 80.0, "Small");
    }

    public String getRoomType() {
        return "Single Room";
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 120.0, "Medium");
    }

    public String getRoomType() {
        return "Double Room";
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 250.0, "Large");
    }

    public String getRoomType() {
        return "Suite Room";
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Polymorphism
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("===== Room Availability =====");

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}