package org.example;

import java.util.*;


public class Main {
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

        Set<Car> carTreeSet = new TreeSet<>(Comparator.comparing(Car::getModel));

        carTreeSet.add(mercedesCarOne);
        carTreeSet.add(mercedesCarThree);
        carTreeSet.add(mercedesCarTwo);
        carTreeSet.add(audiCar);
        carTreeSet.add(audiCarTwo);

        Car carWithMostSeat = Collections.max(carTreeSet, Comparator.comparing(Car::getSeatingCapacity));

        Set<Car> carHashSet = new HashSet<>();

        carHashSet.add(mercedesCarOne);
        carHashSet.add(mercedesCarThree);
        carHashSet.add(mercedesCarTwo);
        carHashSet.add(audiCar);
        carHashSet.add(audiCarTwo);

        Set<Car> carLinkedHashSet = new LinkedHashSet<>(carTreeSet);
        Optional<Car> carWithTheMostSeatAndModel = carHashSet.stream().min(Comparator.comparing(Car::getSeatingCapacity).thenComparing(Car::getModel));

        carLinkedHashSet.forEach(System.out::println);


    }
}