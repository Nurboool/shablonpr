package modul_5_pr;

public class HtmlReportBuilder implements IReportBuilder {

    private Report report = new Report();

    public void setHeader(String header) { report.header = "<h1>"+header+"</h1>"; }
    public void setContent(String content) { report.content = "<p>"+content+"</p>"; }
    public void setFooter(String footer) { report.footer = "<footer>"+footer+"</footer>"; }
    public void addSection(String name, String content) { report.sections.put("<b>"+name+"</b>", content); }
    public void setStyle(ReportStyle style) { report.style = style; }
    public Report getReport() { return report; }
}
