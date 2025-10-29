package pckg_fst_app;

public class Test {
    public static void main(String[] args) {
        WeaherStation ws = new WeaherStation(23, 1013, 60);
        MobileWthApp app1 = new MobileWthApp();
        MobileWthApp app2 = new MobileWthApp();
        ws.add(app1);
        ws.add(app2);
        ws.setWSData(25, 1010, 55);

    }
}
