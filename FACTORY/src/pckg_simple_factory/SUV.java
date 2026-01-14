package pckg_simple_factory;

public class SUV extends Car {

    public SUV(String model, String manufacturer){
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
