package abstract_method_factory;

import pckg_simple_factory.Car;

public class EUSuv extends Car {

    public EUSuv(String model, String manufacturer) {
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "EUSuv{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
