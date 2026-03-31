package facade_hotel_9PR;

public class HotelFacade {

    private RoomBookingSystem room = new RoomBookingSystem();
    private RestaurantSystem restaurant = new RestaurantSystem();
    private EventManagementSystem event = new EventManagementSystem();
    private CleaningService cleaning = new CleaningService();
    private TaxiService taxi = new TaxiService();

    // 🏨 Бронирование с услугами
    public void bookFullService(String name) {

        room.bookRoom(name);
        restaurant.orderFood("Dinner");
        cleaning.scheduleCleaning("Room for " + name);
    }

    // 🎉 Мероприятие
    public void organizeEvent(String eventName, String guest) {

        event.bookHall(eventName);
        event.orderEquipment();
        room.bookRoom(guest);
    }

    // 🍽 Ресторан + такси
    public void bookRestaurantWithTaxi(String name) {

        restaurant.bookTable(name);
        taxi.callTaxi(name);
    }

    // ❌ Отмена
    public void cancelBooking(String name) {
        room.cancelBooking(name);
    }

    // 🧹 Уборка
    public void requestCleaning(String roomNumber) {
        cleaning.scheduleCleaning(roomNumber);
    }
}