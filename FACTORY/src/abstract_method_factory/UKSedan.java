package abstract_method_factory;

import pckg_simple_factory.Car;

public class UKSedan extends Car {

    public UKSedan(String model, String manufacturer) {
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "UKSedan{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
