package pckg_zad1_vj3;

public class TestApp {

    public static void main(String[] args) {
        WriterInt novelWriter = new NovelWriter();
        WritingOffice writingOffice = new WritingOffice(novelWriter);

        writingOffice.writeNovel(1); // Writing a Science Fiction Novel...
        writingOffice.writeNovel(2); // Writing a Fantasy Novel...
        writingOffice.writeNovel(3); // Writing a Mystery Novel...

        writingOffice.setSomeNovelWriter(new AdaptSF2WriterInt(new SFNovelist()));
        writingOffice.writeNovel(1); // Writing a Science Fiction Novel...
    }
}
