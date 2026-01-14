package abstract_method_factory;

import pckg_simple_factory.Car;

public class EUSedan extends Car {
    public EUSedan(String model, String manufacturer) {
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "EUSedan{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
