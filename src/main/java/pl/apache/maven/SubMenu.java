package pl.apache.maven;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class SubMenu {

    public static void subMenu() {
        System.out.println(" Sortuj po ");
        System.out.println(" 1 - marka\n 2 - kolor\n 3 - liczba drzwi\n 4 - cena\n 5 - przebieg\n 6 - rocznik\n 7 - prędkość maksymalna");

    }
    public static void main() {


        Scanner in = new Scanner(System.in);
        boolean state = true;
        while (state) {

            subMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Wybierz markę");
                    SortingCars.sortCarsByBrand();
                    break;
                case 2:
                    System.out.println("Wybierz kolor");
                    SortingCars.sortCarsByColor();
                    break;
                case 3:
                    System.out.println("Wybierz liczbę drzwi");
                    SortingCars.sortCarsByDoors();
                    break;
                case 4:
                    System.out.println("Wybierz cenę");
                    SortingCars.sortCarsByPrice();
                    break;
                case 5:
                    System.out.println("Wybierz przebieg");
                    SortingCars.sortCarsByMileage();
                    break;
                case 6:
                    System.out.println("Wybierz rocznik");
                    SortingCars.sortCarsByProductionYear();
                    break;
                case 7:
                    System.out.println("Wybierz prędkość maksymalną");
                    SortingCars.sortCarsByMaxSpeed();
                    break;
                default:
                    System.out.println("Brak opcji");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        main();
    }
}

