package pckg_Event_solution;

import pckg_fst_app.MobileWthApp;

public class TestAppWthStation {

    public static void main(String[] args) {
        WSUpdated wsUpdated = new WSUpdated(27.6f, 1200, 65.0f);
        MobileWthAppNew mobileWthApp1 = new MobileWthAppNew();
        MobileWthAppNew mobileWthApp2 = new MobileWthAppNew();
        wsUpdated.registerObserver(mobileWthApp1);
        wsUpdated.registerObserver(mobileWthApp2);
        wsUpdated.notifyRegisteredObservers();
    }
}
