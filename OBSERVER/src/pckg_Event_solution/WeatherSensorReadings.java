package pckg_Event_solution;

import java.time.Instant;

public record WeatherSensorReadings(float temp, float press, float humidity, Instant atTime) {


}
