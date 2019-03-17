package pl.apache.maven;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCars {

    public static List<Car> sortCarsByColor() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getColor))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByBrand() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getBrand))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByDoors() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getDoors))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByPrice() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByMileage() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getMileage))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByProductionYear() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getDate))
                .collect(Collectors.toList());
        return cars;
    }
    public static List<Car> sortCarsByMaxSpeed() {
        List<Car> cars = AutoSale.cars.stream()
                .sorted(Comparator.comparing(Car::getMaxSpeed))
                .collect(Collectors.toList());
        return cars;
    }
}