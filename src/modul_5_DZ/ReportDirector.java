package modul_5_DZ;

public class ReportDirector {

    public void constructReport(IReportBuilder builder) {
        builder.setHeader("Sales Report");
        builder.setContent("Total sales: 1500$");
        builder.setFooter("2025 Company");
    }
}
