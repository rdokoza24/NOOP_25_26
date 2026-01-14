package fst_factorymethod_pckg;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HTMLDocumentParser implements DocumentParser {

    @Override
    public IngestedDocument parseDocument(RAWDocument rawDocument) {
        // simulation
        String html = new String(rawDocument.getFileByteContent(), StandardCharsets.UTF_8);
        String extractedContent = html.replaceAll("\\<.*?>", "");
        String normalized = "[HTML-TEXT] " + extractedContent.replaceAll("\\s+", " ").trim();
        Map<String, String> metaData = new LinkedHashMap<>();
        metaData.put("mime", "text/html");
        metaData.put("cleaning", "boilerplate-removal");
        metaData.put("linksNormalized", "true");


        return new IngestedDocument(rawDocument.getSourceID(), "HTML", normalized, metaData);
    }
}
