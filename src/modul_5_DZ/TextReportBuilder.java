package modul_5_DZ;

public class TextReportBuilder implements IReportBuilder {

    private Report report = new Report();

    public void setHeader(String header) {
        report.setHeader("TEXT HEADER: " + header);
    }

    public void setContent(String content) {
        report.setContent(content);
    }

    public void setFooter(String footer) {
        report.setFooter("TEXT FOOTER: " + footer);
    }

    public Report getReport() {
        return report;
    }
}
