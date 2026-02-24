package modul_6_pr;

public class TravelRequest {

    public double distance;
    public ServiceClass serviceClass;
    public DiscountType discountType;
    public int passengers;
    public boolean extraBaggage;
    public boolean transfer;

    public TravelRequest(double distance,
                         ServiceClass serviceClass,
                         DiscountType discountType,
                         int passengers,
                         boolean extraBaggage,
                         boolean transfer) {

        if (distance <= 0 || passengers <= 0)
            throw new IllegalArgumentException("Distance and passengers must be positive.");

        this.distance = distance;
        this.serviceClass = serviceClass;
        this.discountType = discountType;
        this.passengers = passengers;
        this.extraBaggage = extraBaggage;
        this.transfer = transfer;
    }
}