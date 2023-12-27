package it.camp.dziedziczenie.model;

import it.camp.dziedziczenie.zadaniedomowe.Czworokat;
import it.camp.dziedziczenie.zadaniedomowe.Pieciokat;
import it.camp.dziedziczenie.zadaniedomowe.Szesciokat;
import it.camp.dziedziczenie.zadaniedomowe.Trojkat;

import java.util.ArrayList;

public class Figura {

    public Figura(int[] tablicaLiczb) {
        WhichFigureCanYouCreate(tablicaLiczb);
    }

    public Figura() {
    }

    public void WhichFigureCanYouCreate(int[] tablicaLiczb){
        if(tablicaLiczb.length == 3){
            Trojkat trojkat = new Trojkat(tablicaLiczb);
        }
        else if(tablicaLiczb.length == 4){
            Czworokat czworokat = new Czworokat(tablicaLiczb);
        }
        else if(tablicaLiczb.length == 5) {
            Pieciokat pieciokat = new Pieciokat(tablicaLiczb);
        }
        else if(tablicaLiczb.length == 6){
            Szesciokat szesciokat = new Szesciokat(tablicaLiczb);
        }
    }

    public static boolean CheckIfCanCreateANFigure(int[] tablicaLiczb){
        for(int i = 0; i < tablicaLiczb.length; i++){
            int suma = 0;
            for(int element : tablicaLiczb){
                suma += element;
            }
            if(! (suma - 2 * tablicaLiczb[i] > 0)){
                return false;
            }
        }
        return true;
    }

}
