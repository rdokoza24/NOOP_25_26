package abstract_method_factory;

import pckg_simple_factory.Car;
import pckg_simple_factory.CarType;

public class EUCarStore extends CarStore {
    @Override
    public Car createCar(CarType carType, String model, String manufacturer) {
        Car car = null;

        if(carType == CarType.SEDAN){
            car = new EUSedan(model, manufacturer);
        } else if(carType == CarType.SUV){
            car = new EUSuv(model, manufacturer);
        }
        return car;
    }
}
