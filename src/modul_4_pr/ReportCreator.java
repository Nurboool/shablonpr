package modul_4_pr;

public class ReportCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Report();
    }
}
