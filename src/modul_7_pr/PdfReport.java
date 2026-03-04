package modul_7_pr;

public class PdfReport extends ReportGenerator {

    protected void formatData() {
        System.out.println("Formatting data for PDF");
    }

    protected void generateHeader() {
        System.out.println("PDF Header");
    }
}