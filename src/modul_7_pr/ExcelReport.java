package modul_7_pr;

public class ExcelReport extends ReportGenerator {

    protected void formatData() {
        System.out.println("Formatting data for Excel");
    }

    protected void generateHeader() {
        System.out.println("Excel Header");
    }

    protected void saveReport() {
        System.out.println("Saving Excel file...");
    }
}