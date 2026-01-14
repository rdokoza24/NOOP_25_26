package pckg_simple_factory;

public class HATCHBACK extends Car{

    public HATCHBACK(String model, String manufacturer){
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "HATCHBACK{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
