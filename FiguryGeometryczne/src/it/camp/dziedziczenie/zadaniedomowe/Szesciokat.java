package it.camp.dziedziczenie.zadaniedomowe;

import it.camp.dziedziczenie.db.FiguryGeometryczneRepository;
import it.camp.dziedziczenie.model.Figura;

public class Szesciokat extends Figura {

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public Szesciokat(int[] tablicaLiczb) {
        this.a = tablicaLiczb[0];
        this.b = tablicaLiczb[1];
        this.c = tablicaLiczb[2];
        this.d = tablicaLiczb[3];
        this.e = tablicaLiczb[4];
        this.f = tablicaLiczb[5];
        CheckWhichHexagon(a,b,c,d,e,f);
    }

    public static void CheckWhichHexagon(int a, int b, int c, int d, int e, int f){
        if(a == b
                && a == c
                && a == d
                && a == e
                && a == f) {
            FiguryGeometryczneRepository.addToRepository( new SzesciokatForemny(a,b,c,d,e,f));
        } else{
            FiguryGeometryczneRepository.addToRepository( new Szesciokat(a,b,c,d,e,f));
        }
    }

    public Szesciokat(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String toString() {
        return "Szesciokąt o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + e + ", "
                + f + ", "
                + " obwód:  " + Obwod(a,b,c,d,e,f);
    }

    public static int Obwod(int a, int b, int c, int d, int e, int f){
        return a + b + c + d + e + f;
    }

}
