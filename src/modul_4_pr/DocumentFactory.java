package modul_4_pr;

public class DocumentFactory {

    public static DocumentCreator getCreator(String type) {

        switch (type.toLowerCase()) {
            case "report":
                return new ReportCreator();
            case "resume":
                return new ResumeCreator();
            case "letter":
                return new LetterCreator();
            case "invoice":
                return new InvoiceCreator();
            default:
                throw new IllegalArgumentException("Unknown document type");
        }
    }
}
