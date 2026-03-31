package facade_hotel_9PR;

public class RoomBookingSystem {

    public void bookRoom(String name) {
        System.out.println("Room booked for " + name);
    }

    public void cancelBooking(String name) {
        System.out.println("Booking cancelled for " + name);
    }
}