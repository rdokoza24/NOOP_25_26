package pckg_simple_factory;

public class SEDAN extends Car{

    public SEDAN(String model, String manufacturer){
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "SEDAN{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
