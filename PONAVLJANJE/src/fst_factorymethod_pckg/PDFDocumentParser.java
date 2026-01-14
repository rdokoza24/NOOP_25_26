package fst_factorymethod_pckg;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class PDFDocumentParser implements DocumentParser {

    @Override
    public IngestedDocument parseDocument(RAWDocument rawDocument) {
        // simulation
        String extractedContent = "Extracted text from PDF content: " + new String(rawDocument.getFileByteContent(), StandardCharsets.UTF_8);
        Map<String, String> metaData = new LinkedHashMap<>();
        metaData.put("content", "app/pdf");
        metaData.put("extraction", "pdfbox-like");
        metaData.put("pages", "200");

        return new IngestedDocument(rawDocument.getSourceID(), "PDF", extractedContent, metaData);
    }
}
