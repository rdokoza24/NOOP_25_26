package abstract_method_factory;

import pckg_simple_factory.Car;
import pckg_simple_factory.CarType;

public class TestApp {

    public static void main(String[] args) {
        CarStore EUCarStore = new EUCarStore();
        CarStore UKCarStore = new UKCarStore();

        Car euSuv = EUCarStore.orderCar(CarType.SUV, "A6", "Audi");
        Car ukSedan = UKCarStore.orderCar(CarType.SEDAN, "3 Series", "BMW");

        System.out.println(euSuv);
        System.out.println(ukSedan);


    }
}
