package pl.apache.maven;

import java.io.*;

public class ReadingFile {

    public static void fileOutPut() {
        try {
            FileOutputStream f = new FileOutputStream(new File("ListOfCars.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            for (Car car : AutoSale.cars) {
                o.writeObject(car);
                o.writeObject(car);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku ");
        } catch (IOException e) {
            System.out.println("Błąd ");
        }

    }

    public static void fileInput() {
        try {
            FileInputStream fi = new FileInputStream(new File("ListOfCars.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            for (Car car : AutoSale.cars) {
                oi.readObject();
                oi.readObject();
            }


            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}