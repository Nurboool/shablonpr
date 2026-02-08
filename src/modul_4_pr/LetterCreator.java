package modul_4_pr;

public class LetterCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Letter();
    }
}
