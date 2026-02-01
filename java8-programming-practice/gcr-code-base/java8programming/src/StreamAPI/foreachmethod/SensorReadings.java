package StreamAPI.foreachmethod;

import java.util.*;

public class SensorReadings {

    public static void main(String[] args) {

        List<Double> readings =
                Arrays.asList(22.5, 35.0, 41.8, 29.3, 45.6);

        double threshold = 35.0;

        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value ->
                        System.out.println("High reading detected: " + value)
                );
    }
}
