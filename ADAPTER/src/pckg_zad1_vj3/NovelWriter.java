package pckg_zad1_vj3;

public class NovelWriter implements WriterInt{
    @Override
    public void writeNovel(int novelType) {
        switch(novelType){
            case 1:
                System.out.println("Writing a Science Fiction Novel...");
                break;
            case 2:
                System.out.println("Writing a Fantasy Novel...");
                break;
            case 3:
                System.out.println("Writing a Mystery Novel...");
                break;
            default:
                throw new IllegalArgumentException("Nemere");
        }
    }

    @Override
    public String toString() {
        return "NovelWriter{}";
    }
}
