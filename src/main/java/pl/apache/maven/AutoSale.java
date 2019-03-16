package pl.apache.maven;

import sun.util.resources.cldr.es.CalendarData_es_AR;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AutoSale {

    public static List<Car> cars = new ArrayList<Car>();

    public void addingCar() {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj parametry samochodu");

        System.out.println("Podaj nazwę marki");
        String name = userScanner.nextLine();

        System.out.println("Podaj kolor");
        String color = userScanner.nextLine();

        System.out.println("Podaj liczbę drzwi");
        int doors = userScanner.nextInt();

        System.out.println("Podaj cenę");
        BigDecimal price = userScanner.nextBigDecimal();

        System.out.println("Podaj przebieg");
        int mileage = userScanner.nextInt();

        System.out.println("Podaj rocznik");
        int data = userScanner.nextInt();

        System.out.println("Podaj prędkość maksymalną");
        int maxSpeed = userScanner.nextInt();

        Car car = new Car(name, color, doors, price, mileage, data, maxSpeed);

        cars.add(car);
    }

    public static void showListOfCars() {
        for (Car car:cars) {
           StringBuilder lists = new StringBuilder();

        }

    }

    public static void main(String[] args) {


    }
}
