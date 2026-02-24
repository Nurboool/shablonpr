package modul_6_DZ;

public class EmailObserver implements IObserver {

    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String currency, double rate) {
        System.out.println("Email на " + email + ": Курс " + currency + " изменился на " + rate);
    }
}