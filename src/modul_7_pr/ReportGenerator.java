package modul_7_pr;

public abstract class ReportGenerator {

    public final void generateReport() {

        loadData();
        formatData();
        generateHeader();

        if (customerWantsSave())
            saveReport();
    }

    protected void loadData() {
        System.out.println("Loading data...");
    }

    protected abstract void formatData();
    protected abstract void generateHeader();

    protected void saveReport() {
        System.out.println("Saving report...");
    }

    protected boolean customerWantsSave() {
        return true;
    }
}