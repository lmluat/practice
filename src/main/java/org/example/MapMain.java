package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Car mercedesCarOne = new Car(1L, "Mercedes", "C-Class", 2021, "Black",
                5);

        Car mercedesCarTwo = new Car(2L, "Mercedes", "C-Class", 2021, "Black",
                6);
        Car mercedesCarThree = new Car(3L, "Mercedes", "E-Class", 2021, "Black",
                33);
        Car audiCar = new Car(4L, "Audi", "C-Class", 2020, "White",
                2);
        Car audiCarTwo = new Car(5L, "Audi", "D-Class", 2020, "White",
                33);

        Map<Long,Car> carMap = new HashMap<>();

        carMap.put(mercedesCarOne.getId(),mercedesCarOne);
        carMap.put(mercedesCarTwo.getId(),mercedesCarTwo);
        carMap.put(mercedesCarThree.getId(),mercedesCarThree);
        carMap.put(audiCar.getId(),audiCar);
        carMap.put(audiCarTwo.getId(),audiCarTwo);

        System.out.println(carMap);

        Car car = carMap.values().stream().max((car1,car2) -> Integer.compare(car1.getSeatingCapacity(),car2.getSeatingCapacity())).orElse(null);
        System.out.println(car);
    }
}
