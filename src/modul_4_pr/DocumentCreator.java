package modul_4_pr;

public abstract class DocumentCreator {

    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}
