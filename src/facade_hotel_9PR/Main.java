package facade_hotel_9PR;

public class Main {

    public static void main(String[] args) {

        HotelFacade facade = new HotelFacade();

        facade.bookFullService("Ali");
        System.out.println("-----");

        facade.organizeEvent("Conference", "John");
        System.out.println("-----");

        facade.bookRestaurantWithTaxi("Sara");
        System.out.println("-----");

        facade.cancelBooking("Ali");
        facade.requestCleaning("101");
    }
}