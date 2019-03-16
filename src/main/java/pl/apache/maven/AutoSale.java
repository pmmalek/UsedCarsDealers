package pl.apache.maven;

import sun.util.resources.cldr.es.CalendarData_es_AR;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AutoSale<Car> {

  public List<Car> cars = new ArrayList<Car>();

    public static void addingCar() {
      Scanner userScanner = new Scanner(System.in);
      System.out.println("Podaj parametry samochodu");

      System.out.println("Podaj nazwę marki");
      System.out.println("Podaj kolor");
      System.out.println("Podaj liczbę drzwi");
      System.out.println("Podaj cenę");
      System.out.println("Podaj przebieg");
      System.out.println("Podaj rocznik");
      System.out.println("Podaj prędkość maksymalną");

    }



    public static void main(String[] args) {


    }
}
