package fst_factorymethod_pckg;

public class DOCXIngestor extends Ingestor{

    @Override
    protected DocumentParser createDocParser() {
        return new DOCXDocumentParser();
    }
}
