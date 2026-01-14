package pckg_simple_factory;

public class SimpleCarCreator {

    public static Car createCar(CarType carType, String model, String manufacturer){
        Car car = null;
        if(carType.equals(CarType.SUV)){
            car = new SUV(model, manufacturer);
        } else if(carType.equals(CarType.SEDAN)){
            car = new SEDAN(model, manufacturer);
        } else if(carType.equals(CarType.CABRIO)){
            car = new CABRIO(model, manufacturer);
        } else if(carType.equals(CarType.HATCHBACK)){
            car = new HATCHBACK(model, manufacturer);
        }
        return car;
    }
}
