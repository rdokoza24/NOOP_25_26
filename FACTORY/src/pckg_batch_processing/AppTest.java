package pckg_batch_processing;

import java.io.File;

public class AppTest {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        File file = new File("FACTORY/src/pckg_batch_processing/data.txt");
        fileProcessor.processFile(file);
        fileProcessor.setBatchProcessor(new CSVBatchProcessor());
        File csvFile = new File("FACTORY/src/pckg_batch_processing/data.csv");
        fileProcessor.processFile(csvFile);
        File jsonFile = new File("FACTORY/src/pckg_batch_processing/data.json");
        fileProcessor.setBatchProcessor(new JSONBatchProcessor());
        fileProcessor.processFile(jsonFile);
    }
}
