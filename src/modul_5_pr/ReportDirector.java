package modul_5_pr;

public class ReportDirector {

    public void construct(IReportBuilder builder) {
        builder.setHeader("Game Statistics");
        builder.addSection("Players", "152 online");
        builder.addSection("Servers", "EU-1");
        builder.setContent("Daily activity report");
        builder.setFooter("2026");
        builder.setStyle(new ReportStyle("black","white",14));
    }
}
