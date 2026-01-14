package fst_factorymethod_pckg;

public abstract class Ingestor {

    protected abstract DocumentParser createDocParser();

    public final IngestedDocument ingestDocument(RAWDocument rawDocument) {
        validate(rawDocument);
        DocumentParser documentParser = createDocParser();
        IngestedDocument ingestedDocument = documentParser.parseDocument(rawDocument);
        return ingestedDocument;
    }

    private void validate(RAWDocument rawDocument) {
        if (rawDocument.getFileByteContent().length == 0) {
            throw new IllegalArgumentException("RAWDocument cannot be null");
        }
    }
}
