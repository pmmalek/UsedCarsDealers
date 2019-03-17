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

















    }