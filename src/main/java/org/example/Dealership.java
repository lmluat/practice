package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
public class Dealership {
    private final String name = "LSUPER";
    private String location;
    private ArrayList<Car> inventory = new ArrayList<>();
    public void addCar(Car car){
        inventory.add(car);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }

    public void show(){
        inventory.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
