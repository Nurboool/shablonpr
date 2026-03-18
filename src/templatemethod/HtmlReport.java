package templatemethod;

public class HtmlReport extends ReportGenerator {

    protected void fetchData() {
        System.out.println("Fetching data for HTML");
    }

    protected void formatData() {
        System.out.println("Formatting HTML");
    }

    protected void generateHeader() {
        System.out.println("HTML Header");
    }
}