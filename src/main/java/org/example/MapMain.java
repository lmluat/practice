package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        Car mercedesCar = new Car(1L, "Mercedes", "C-Class", 2021, "Black",
                5);

        Car audiCar = new Car(2L, "Audi", "C-Class", 2021, "Black",
                6);
        Car vinfastCar = new Car(3L, "Vinfast", "E-Class", 2019, "Red",
                33);
        Car hondaCar = new Car(4L, "Honda CRV", "C-Class", 2020, "White",
                2);
        Car morningCar = new Car(5L, "Morning", "D-Class", 2002, "Blue",
                33);

        Map<Long, Car> carMap = new HashMap<>();

        carMap.put(audiCar.getId(), audiCar);
        carMap.put(vinfastCar.getId(), vinfastCar);
        carMap.put(hondaCar.getId(), hondaCar);
        carMap.put(morningCar.getId(), morningCar);
        carMap.put(mercedesCar.getId(), mercedesCar);

        List<Car> carWithRedColor = carMap.values().stream().filter(car1 -> car1.getColor().equals("Red")).collect(Collectors.toList());

        carMap.values().stream()
                .filter(car -> (car.getYear() > 2020))
                .forEach(System.out::println);

        //Predicate
        Predicate<Car> isBlack = car -> car.getColor().equals("Black");
        Predicate<Car> isMercedes = car -> car.getName().equals("Mercedes");

        System.out.println("Predicate");
        carMap.values().stream()
                .filter(isBlack)
                .filter(isMercedes)
                .filter(isYearMoreThan(2000))
                .forEach(System.out::println);

        //Consumer
        Consumer<Car> showCarWithBlackColor = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                if(isBlack("Black",car)){
                    System.out.println(car);
                }
            }
        };
        System.out.println("Consumer");
        carMap.values().forEach(showCarWithBlackColor);




    }

    static void swap(Car car1, Car car2) {
        Car tempCar = car1;
        car1 = car2;
        car2 = tempCar;
    }

    static Predicate<Car> isYearMoreThan(Integer year) {
        return car -> car.getYear() > year;
    }
    static boolean isBlack(String color, Car car) {
        return car.getColor().equals(color);
    }
}
