package modul_5_pr;

import java.util.LinkedHashMap;
import java.util.Map;

public class Report {

    String header;
    String content;
    String footer;
    ReportStyle style;
    Map<String, String> sections = new LinkedHashMap<>();

    public void export() {
        System.out.println("=== REPORT ===");
        System.out.println(header);
        sections.forEach((k,v)-> System.out.println(k + ": " + v));
        System.out.println(content);
        System.out.println(footer);
        System.out.println("Style: " + style.backgroundColor + ", " + style.fontColor + ", " + style.fontSize);
    }
}
