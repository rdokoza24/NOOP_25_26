package pckg_Feed_solution;

public class TestApp {

    public static void main(String[] args) {
        WSWithFeed wsWithFeed = new WSWithFeed(15, 1200, 67);
        MobileWSAppFeeds mobileApp1 = new MobileWSAppFeeds();
        MobileWSAppFeeds mobileApp2 = new MobileWSAppFeeds();
        wsWithFeed.registerObserver(mobileApp1);
        wsWithFeed.registerObserver(mobileApp2);
        wsWithFeed.notifyAllRegObservers();
        wsWithFeed.sensorsDataChanged(9,1003,89);
    }
}
