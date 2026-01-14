package pckg_simple_factory;

public class CABRIO extends Car{

    public CABRIO(String model, String manufacturer){
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "CABRIO{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
