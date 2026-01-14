package pckg_simple_factory;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        CarStore carStore = new CarStore("AutoWorld");
        Car car1 = carStore.orderCar(CarType.SUV, "X5", "BMW");
        Car car2 = carStore.orderCar(CarType.SEDAN, "Model S", "Tesla");
        Car car3 = carStore.orderCar(CarType.CABRIO, "911 Cabriolet", "Porsche");
        Car car4 = carStore.orderCar(CarType.HATCHBACK, "Golf", "Volkswagen");

        System.out.println("Ordered Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
