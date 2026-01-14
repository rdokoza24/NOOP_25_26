package fst_factorymethod_pckg;

public class HTMLIngestor extends Ingestor{

    @Override
    protected DocumentParser createDocParser() {
        return new HTMLDocumentParser();
    }
}
