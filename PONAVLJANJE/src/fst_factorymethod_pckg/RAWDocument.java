package fst_factorymethod_pckg;

import java.util.Arrays;

public final class RAWDocument {

    private final String sourceID;
    private final String fileName;
    private final byte[] fileByteContent;


    public RAWDocument(String sourceID, String fileName, byte[] fileByteContent) {
        this.sourceID = sourceID;
        this.fileName = fileName;
        this.fileByteContent = fileByteContent;
    }

    public String getSourceID() {
        return sourceID;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getFileByteContent() {
        return fileByteContent;
    }

    @Override
    public String toString() {
        return "RAWDocument{" +
                "sourceID='" + sourceID + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileByteContent=" + Arrays.toString(fileByteContent) +
                '}';
    }
}
