package pckg_fst_app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeaherStation implements Observable {


    private float temp;
    private float press;
    private float humidity;
    private final List <ObserverI> observers;

    public WeaherStation(float temp, float press, float humidity) {
        this.temp = temp;
        this.press = press;
        this.humidity = humidity;
        System.out.println("WeaherStation created with temp: " + temp + ", press: " + press + ", humidity: " + humidity);
        this.observers = new CopyOnWriteArrayList<>();
        notifyAllObservers();
    }


    @Override
    public void add(ObserverI ob) {
        if (!observers.contains(ob)) {
            observers.add(ob);
            System.out.println("Observer added.");
            ob.setWS(this);
        } else {
            System.out.println("Observer already registered.");
        }
    }

    @Override
    public void remove(ObserverI ob) {
//        if (observers.contains(ob)) {
//            observers.remove(ob);
//            System.out.println("Observer removed.");
//        } else {
//            System.out.println("Observer not found.");
//        }
    }

    @Override
    public void notifyAllObservers() {
        for (ObserverI ob : observers) {
            ob.update();
        }
    }

    public void setWSData(float temp, float press, float humidity) {
        this.temp = temp;
        this.press = press;
        this.humidity = humidity;
        System.out.println("WeaherStation data updated to temp: " + temp + ", press: " + press + ", humidity: " + humidity);
        notifyAllObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getPress() {
        return press;
    }

    public float getHumidity() {
        return humidity;
    }


}
