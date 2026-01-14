package fst_factorymethod_pckg;

public class PDFIngestor extends Ingestor {

    @Override
    protected DocumentParser createDocParser() {
        return new PDFDocumentParser();
    }
}
