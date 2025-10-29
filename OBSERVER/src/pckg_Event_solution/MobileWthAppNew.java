package pckg_Event_solution;

public class MobileWthAppNew implements GenObserver<WeatherSensorReadings> {
    @Override
    public void update(WeatherSensorReadings event) {
        System.out.println("Mobile Weather App " + this);
        System.out.println(event.temp());
        System.out.println(event.press());
        System.out.println(event.humidity());
        System.out.println(event.atTime());
        System.out.println(event);
        System.out.println("-------------------");
    }
}
