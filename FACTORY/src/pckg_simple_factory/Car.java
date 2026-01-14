package pckg_simple_factory;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Car {

    protected String model;
    protected String manufacturer;
    protected static final LocalDate START = LocalDate.of(2000, 1, 2);
    protected static final LocalDate STOP = LocalDate.now();
    protected LocalDate date;

    protected Car(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
        this.date = getDate();
    }

    private LocalDate getDate(){
        long start = START.toEpochDay();
        long stop = STOP.toEpochDay();
        long randomDateLong = ThreadLocalRandom.current().nextLong(start, stop + 1);

        return LocalDate.ofEpochDay(randomDateLong);
    }
}
