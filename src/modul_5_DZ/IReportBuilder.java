package modul_5_DZ;

public interface IReportBuilder {
    void setHeader(String header);
    void setContent(String content);
    void setFooter(String footer);
    Report getReport();
}
