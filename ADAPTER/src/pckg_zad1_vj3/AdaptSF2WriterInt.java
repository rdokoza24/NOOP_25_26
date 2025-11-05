package pckg_zad1_vj3;

public class AdaptSF2WriterInt implements WriterInt{

    private SFNovelist sfNovelist;

    public AdaptSF2WriterInt(SFNovelist sfNovelist) {
        this.sfNovelist = sfNovelist;
    }

    @Override
    public void writeNovel(int novelType) {
        sfNovelist.writeSFNovel();
    }

    @Override
    public String toString() {
        return "AdaptSF2WriterInt{" +
                "sfNovelist=" + sfNovelist +
                '}';
    }
}
