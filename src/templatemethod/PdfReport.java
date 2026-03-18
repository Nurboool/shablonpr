package templatemethod;

public class PdfReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Fetching data for PDF");
    }

    protected void formatData() {
        System.out.println("Formatting PDF");
    }

    protected void generateHeader() {
        System.out.println("PDF Header");
    }
}