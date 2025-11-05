package pckg_zad1_vj3;

public class WritingOffice {

    private WriterInt someNovelWriter;

    public WritingOffice(WriterInt someNovelWriter) {
        this.someNovelWriter = someNovelWriter;
    }

    public void writeNovel(int novelType){
        someNovelWriter.writeNovel(novelType);
        System.out.println(this.toString());
    }

    public void setSomeNovelWriter(WriterInt someNovelWriter) {
        this.someNovelWriter = someNovelWriter;
    }

    @Override
    public String toString() {
        return "WritingOffice{" +
                "someNovelWriter=" + someNovelWriter +
                '}';
    }
}
