package modul_5_pr;

public interface IReportBuilder {

    void setHeader(String header);
    void setContent(String content);
    void setFooter(String footer);
    void addSection(String name, String content);
    void setStyle(ReportStyle style);
    Report getReport();
}
