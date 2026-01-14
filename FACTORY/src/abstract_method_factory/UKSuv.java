package abstract_method_factory;

import pckg_simple_factory.Car;

public class UKSuv extends Car {

    public UKSuv(String model, String manufacturer) {
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "UKSuv{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
