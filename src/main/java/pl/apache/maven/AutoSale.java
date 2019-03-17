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

    public static void addingCar() {
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
        for (int i = 0; i <cars.size(); i++) {

            Car car = cars.get(i);

            StringBuilder lists = new StringBuilder();
            lists.append("Indeks: ");
            lists.append(i);
            lists.append(" ");
            lists.append("Marka: ");
            lists.append(car.getBrand());
            lists.append(" ");
            lists.append("Liczba drzwi: ");
            lists.append(car.getDoors());
            lists.append(" ");
            lists.append("Prędkość maksymalna: ");
            lists.append(car.getMaxSpeed());
            lists.append("km/h ");
            lists.append("Kolor: ");
            lists.append(car.getColor());
            lists.append(" ");
            lists.append("Rok produkcji: ");
            lists.append(car.getDate());
            lists.append(" ");
            lists.append("Przebieg: ");
            lists.append(car.getMileage());
            lists.append("km ");
            lists.append("Cena: ");
            lists.append(car.getPrice());
            lists.append("zł ");

            System.out.println(lists);

        }

    }

    public static void removeCar(int index) {
        cars.remove(index);


    }

    public static void main(String[] args) {


    }
}
