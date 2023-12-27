package it.camp.dziedziczenie.zadaniedomowe;

import it.camp.dziedziczenie.db.FiguryGeometryczneRepository;
import it.camp.dziedziczenie.model.Figura;

public class Pieciokat extends Figura {

    int a;
    int b;
    int c;
    int d;
    int e;

    public Pieciokat(int[] tablicaLiczb) {
        this.a = tablicaLiczb[0];
        this.b = tablicaLiczb[1];
        this.c = tablicaLiczb[2];
        this.d = tablicaLiczb[3];
        this.e = tablicaLiczb[4];
        CheckWhichPentagon(a,b,c,d,e);
    }

    public static void CheckWhichPentagon(int a, int b, int c, int d, int e){
        if(a == b
                && a == c
                && a == d
                && a == e) {
            FiguryGeometryczneRepository.addToRepository( new PieciokatForemny(a,b,c,d,e));
        } else{
            FiguryGeometryczneRepository.addToRepository( new Pieciokat(a,b,c,d,e));
        }
    }
    public Pieciokat(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public String toString() {
        return "Pięciokąt o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + e + ", "
                + "obwód:  " + Obwod(a,b,c,d,e);
    }
    public static int Obwod(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }

}
