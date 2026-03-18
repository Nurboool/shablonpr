package shablon_8;

public class PR {

    // ================= INTERFACE =================
    interface IReport {
        String generate();
    }

    // ================= BASE REPORTS =================
    static class SalesReport implements IReport {
        public String generate() {
            return "Sales Report: [date=01, amount=1000]";
        }
    }

    static class UserReport implements IReport {
        public String generate() {
            return "User Report: [user=Ali, age=25]";
        }
    }

    // ================= ABSTRACT DECORATOR =================
    static abstract class ReportDecorator implements IReport {
        protected IReport report;

        public ReportDecorator(IReport report) {
            this.report = report;
        }

        public String generate() {
            return report.generate();
        }
    }

    // ================= DECORATORS =================
    static class DateFilterDecorator extends ReportDecorator {

        public DateFilterDecorator(IReport report) {
            super(report);
        }

        public String generate() {
            return super.generate() + " | Filtered by date";
        }
    }

    static class SortingDecorator extends ReportDecorator {

        public SortingDecorator(IReport report) {
            super(report);
        }

        public String generate() {
            return super.generate() + " | Sorted";
        }
    }

    static class CsvExportDecorator extends ReportDecorator {

        public CsvExportDecorator(IReport report) {
            super(report);
        }

        public String generate() {
            return super.generate() + " | Exported to CSV";
        }
    }

    static class PdfExportDecorator extends ReportDecorator {

        public PdfExportDecorator(IReport report) {
            super(report);
        }

        public String generate() {
            return super.generate() + " | Exported to PDF";
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        // Базовый отчет
        IReport report = new SalesReport();

        // Декораторлар қосу (динамикалық)
        report = new DateFilterDecorator(report);
        report = new SortingDecorator(report);
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());

        // Басқа комбинация
        IReport userReport = new UserReport();
        userReport = new PdfExportDecorator(userReport);

        System.out.println(userReport.generate());
    }
}