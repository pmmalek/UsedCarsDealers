package pl.apache.maven;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class SubMenu {

    public static void subMenu() {
        System.out.println(" Wybierz listę parametrów");

    }
    public static void main() {


        Scanner in = new Scanner(System.in);
        boolean state = true;
        while (state) {

            subMenu();
            new Menu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Wybierz markę");
                    break;
                case 2:
                    System.out.println("Wybierz kolor");
                    break;
                case 3:
                    System.out.println("Wybierz liczbę drzwi");
                    break;
                case 4:
                    System.out.println("Wybierz cenę");
                    break;
                case 5:
                    System.out.println("Wybierz przebieg");
                    break;
                case 6:
                    System.out.println("Wybierz rocznik");
                    break;
                case 7:
                    System.out.println("Wybierz prędkość maksymalną");
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

