package shablon_8;

public class IDZ {

    // ================= INTERNAL INTERFACE =================
    interface IInternalDeliveryService {

        void deliverOrder(String orderId);

        String getDeliveryStatus(String orderId);
    }

    // ================= INTERNAL SERVICE =================
    static class InternalDeliveryService implements IInternalDeliveryService {

        public void deliverOrder(String orderId) {
            System.out.println("Internal delivery: order " + orderId);
        }

        public String getDeliveryStatus(String orderId) {
            return "Delivered (Internal)";
        }
    }

    // ================= EXTERNAL SERVICE A =================
    static class ExternalLogisticsServiceA {

        public void shipItem(int itemId) {
            System.out.println("ServiceA shipping item: " + itemId);
        }

        public String trackShipment(int shipmentId) {
            return "In transit (ServiceA)";
        }
    }

    // ================= EXTERNAL SERVICE B =================
    static class ExternalLogisticsServiceB {

        public void sendPackage(String info) {
            System.out.println("ServiceB sending package: " + info);
        }

        public String checkPackageStatus(String code) {
            return "Delivered (ServiceB)";
        }
    }

    // ================= ADAPTER A =================
    static class LogisticsAdapterA implements IInternalDeliveryService {

        private ExternalLogisticsServiceA serviceA;

        public LogisticsAdapterA(ExternalLogisticsServiceA serviceA) {
            this.serviceA = serviceA;
        }

        public void deliverOrder(String orderId) {
            try {
                int id = Integer.parseInt(orderId);
                serviceA.shipItem(id);
            } catch (Exception e) {
                System.out.println("Error converting orderId for ServiceA");
            }
        }

        public String getDeliveryStatus(String orderId) {
            try {
                int id = Integer.parseInt(orderId);
                return serviceA.trackShipment(id);
            } catch (Exception e) {
                return "Error tracking order in ServiceA";
            }
        }
    }

    // ================= ADAPTER B =================
    static class LogisticsAdapterB implements IInternalDeliveryService {

        private ExternalLogisticsServiceB serviceB;

        public LogisticsAdapterB(ExternalLogisticsServiceB serviceB) {
            this.serviceB = serviceB;
        }

        public void deliverOrder(String orderId) {
            serviceB.sendPackage(orderId);
        }

        public String getDeliveryStatus(String orderId) {
            return serviceB.checkPackageStatus(orderId);
        }
    }

    // ================= FACTORY =================
    static class DeliveryServiceFactory {

        public static IInternalDeliveryService getService(String type) {

            switch (type) {

                case "internal":
                    return new InternalDeliveryService();

                case "A":
                    return new LogisticsAdapterA(new ExternalLogisticsServiceA());

                case "B":
                    return new LogisticsAdapterB(new ExternalLogisticsServiceB());

                default:
                    throw new IllegalArgumentException("Unknown service type");
            }
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        // Выбор сервиса (меняй: internal / A / B)
        IInternalDeliveryService service =
                DeliveryServiceFactory.getService("A");

        service.deliverOrder("123");
        System.out.println(service.getDeliveryStatus("123"));

        System.out.println("-------------");

        // Другой сервис
        IInternalDeliveryService serviceB =
                DeliveryServiceFactory.getService("B");

        serviceB.deliverOrder("ABC123");
        System.out.println(serviceB.getDeliveryStatus("ABC123"));
    }
}
