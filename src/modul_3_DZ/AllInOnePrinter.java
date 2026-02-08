package modul_3_DZ;


public class AllInOnePrinter implements Printer, ScannerDevice, FaxDevice {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
