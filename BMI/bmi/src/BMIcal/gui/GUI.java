package BMIcal.gui;

import BMIcal.kalkulator.Kalkulator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GUI {
    
    public int MenuAndChoice(){
        Scanner skaner = new Scanner(System.in);
        System.out.println(" 1. Oblicz BMI.");
        System.out.println(" 2. Przypomnij BMI.");
        System.out.println(" 3. Exit.");
        int choice = skaner.nextInt();
        return choice;
    }

    Kalkulator kalkulator = new Kalkulator();

    public double GetDataAndReturnBmi() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj masę w kilogramach");
        double waga = 0;
        try {
            waga = skaner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
        }
        System.out.println("Podaj wzrost w metrach ");
        double wzrost = 0;
        try {
            wzrost = skaner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
        }
        double BMI = kalkulator.CountBMI(waga, wzrost);
        return BMI;
    }

    public int WczytajID(){
        System.out.println("Podaj swoje ID");
        Scanner skaner = new Scanner(System.in);
        int twojeID = skaner.nextInt();
        return twojeID;
    }




}
