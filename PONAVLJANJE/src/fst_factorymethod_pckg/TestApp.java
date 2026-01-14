package fst_factorymethod_pckg;

import java.nio.charset.StandardCharsets;

public class TestApp {

    public static void main(String[] args) {
        RAWDocument pdfRawDoc = new RAWDocument("SRC001", "sample.pdf", "Depp content of PDF".getBytes(StandardCharsets.UTF_8));
        RAWDocument docxRawDoc = new RAWDocument("SRC002", "sample.docx", "Depp content of DOCX".getBytes(StandardCharsets.UTF_8));
        RAWDocument htmlRawDoc = new RAWDocument("SRC003", "sample.html", "<html><body>Depp content of HTML</body></html>".getBytes(StandardCharsets.UTF_8));
        System.out.println("--- Ingesting PDF Document ---");
        IngestorManager ingestorManager = new IngestorManager();
        ingestorManager.ingestDocument(pdfRawDoc);
        System.out.println("\n--- Ingesting DOCX Document ---");
        ingestorManager.setIngestor(new DOCXIngestor());
        ingestorManager.ingestDocument(docxRawDoc);
        System.out.println("\n--- Ingesting HTML Document ---");
        ingestorManager.setIngestor(new HTMLIngestor());
        ingestorManager.ingestDocument(htmlRawDoc);
    }
}
