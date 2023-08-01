package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Long, Car> carMap = new HashMap<>();

        carMap.put(mercedesCarOne.getId(), mercedesCarOne);
        carMap.put(mercedesCarTwo.getId(), mercedesCarTwo);
        carMap.put(mercedesCarThree.getId(), mercedesCarThree);
        carMap.put(audiCar.getId(), audiCar);
        carMap.put(audiCarTwo.getId(), audiCarTwo);

//        System.out.println(carMap);

        Car car = carMap.values().stream().max(Comparator.comparingInt(Car::getSeatingCapacity)).orElse(null);

        List<Car> carWithRedColor = carMap.values().stream().filter(car1 -> car1.getColor().equals("Red")).collect(Collectors.toList());



    }

    static void swap(Car car1, Car car2) {
        Car tempCar = car1;
        car1 = car2;
        car2 = tempCar;
    }
}
