package pckg_fst_app;

public class MobileWthApp implements ObserverI {

    private float temp;
    private float press;
    private float humidity;
    private WeaherStation ws;

    public MobileWthApp() {
        System.out.println("MobileWthApp created with temp: " + temp + ", press: " + press + ", humidity: " + humidity);
    }

    @Override
    public void setWS(WeaherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        this.temp = ws.getTemp();
        this.press = ws.getPress();
        this.humidity = ws.getHumidity();
        System.out.println(this + " received update from WeaherStation.");
        System.out.println("MobileWthApp updated: temperature = " + this.temp + ", pressure = " + this.press + ", humidity = " + this.humidity);
        ws.notifyAllObservers();
    }
}
