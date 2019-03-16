package pl.apache.maven;

import sun.applet.Main;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        System.out.println(" Witaj w aplikacji Diler Samochodowy");
        System.out.println(" Co chcesz zrobić");
        System.out.println(" 1 - dodać nowy samochód\n 2 - wyświetlić listę dodanych samochodów\n 3 - usunąć samochód");
        System.out.print(" Selekcja: ");
    }

    public static void main() {


        Scanner in = new Scanner(System.in);
        boolean state = true;
        while (state) {

            displayMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Wybrałeś opcje 1");
                    AutoSale.addingCar();
                    break;
                case 2:
                    System.out.println("Wybrałeś opcje 2");
                    AutoSale.showListOfCars();
                    break;
                case 3:
                    System.out.println("Wybrałeś opcje 3");
                    AutoSale.removeCar(in.nextInt());
                    break;
                case 4:
                    System.out.println("Bye bye");
                    state=false;
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
