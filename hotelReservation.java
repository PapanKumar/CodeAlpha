import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int id;
    String type;
    double price;
    boolean isBooked;

    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }
}

public class hotelReservation {
    static ArrayList<Room> rooms = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeRooms();
        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. View My Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: viewRooms(); break;
                case 2: bookRoom(); break;
                case 3: viewBooking(); break;
                case 4: System.out.println("Thank you for using our system!"); return;
                default: System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Initialize some rooms
    static void initializeRooms() {
        rooms.add(new Room(1, "Single Room", 50));
        rooms.add(new Room(2, "Double Room", 80));
        rooms.add(new Room(3, "Suite", 150));
    }

    // Display available rooms
    static void viewRooms() {
        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            if (!room.isBooked) {
                System.out.println("ID: " + room.id + " | Type: " + room.type + " | Price: $" + room.price + " per night");
            }
        }
    }

    // Book a room
    static void bookRoom() {
        System.out.print("\nEnter Room ID to book: ");
        int roomId = scanner.nextInt();
        for (Room room : rooms) {
            if (room.id == roomId && !room.isBooked) {
                room.isBooked = true;
                System.out.println("You have successfully booked the " + room.type + " for $" + room.price + " per night.");
                return;
            }
        }
        System.out.println("Room not available or invalid ID!");
    }

    // View booked rooms
    static void viewBooking() {
        System.out.println("\nYour Booking:");
        boolean hasBooking = false;
        for (Room room : rooms) {
            if (room.isBooked) {
                System.out.println("You have booked: " + room.type + " for $" + room.price + " per night.");
                hasBooking = true;
            }
        }
        if (!hasBooking) {
            System.out.println("No bookings found.");
        }
    }
}
