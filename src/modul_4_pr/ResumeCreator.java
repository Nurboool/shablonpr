package modul_4_pr;

public class ResumeCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Resume();
    }
}
