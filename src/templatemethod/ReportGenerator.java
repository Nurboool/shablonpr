package templatemethod;

public abstract class ReportGenerator {

    public final void generateReport() {

        fetchData();
        formatData();
        generateHeader();

        if (customerWantsSave()) {
            saveReport();
        }

        log("Report generated");
    }

    protected abstract void fetchData();

    protected abstract void formatData();

    protected abstract void generateHeader();

    protected void saveReport() {
        System.out.println("Saving report");
    }

    protected boolean customerWantsSave() {
        return true;
    }

    protected void log(String message) {
        System.out.println("LOG: " + message);
    }
}