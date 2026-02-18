package modul_5_pr;

public class BuilderTest {

    public static void main(String[] args) {

        ReportDirector director = new ReportDirector();

        IReportBuilder builder = new HtmlReportBuilder();
        director.construct(builder);

        builder.getReport().export();
    }
}
