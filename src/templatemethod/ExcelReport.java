package templatemethod;

public class ExcelReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Fetching data for Excel");
    }

    protected void formatData() {
        System.out.println("Formatting Excel");
    }

    protected void generateHeader() {
        System.out.println("Excel Header");
    }

    protected void saveReport() {
        System.out.println("Saving Excel file...");
    }
}