package modul_5_pr;

public class TextReportBuilder implements IReportBuilder {

    private Report report = new Report();

    public void setHeader(String header) { report.header = header; }
    public void setContent(String content) { report.content = content; }
    public void setFooter(String footer) { report.footer = footer; }
    public void addSection(String name, String content) { report.sections.put(name, content); }
    public void setStyle(ReportStyle style) { report.style = style; }
    public Report getReport() { return report; }
}
