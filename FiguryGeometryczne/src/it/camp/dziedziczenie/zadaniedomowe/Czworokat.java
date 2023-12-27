package it.camp.dziedziczenie.zadaniedomowe;

import it.camp.dziedziczenie.db.FiguryGeometryczneRepository;
import it.camp.dziedziczenie.model.Figura;

public class Czworokat extends Figura {

    int a;
    int b;
    int c;
    int d;

    public Czworokat(int[] tablicaLiczb) {
        this.a = tablicaLiczb[0];
        this.b = tablicaLiczb[1];
        this.c = tablicaLiczb[2];
        this.d = tablicaLiczb[3];
        CheckWhichQuadrangle(a,b,c,d);
    }

    public static void CheckWhichQuadrangle(int a, int b, int c, int d){
        if(a == b && a == c && a == d) {
            FiguryGeometryczneRepository.addToRepository( new Kwadrat(a,b,c,d));
        } else if((a == b || a == c || a == d )
                && (b == a || b == c || b == d)
                && (c == a || c == b || c == d)) {
            FiguryGeometryczneRepository.addToRepository( new Prostokat(a,b,c,d));
        } else{
            FiguryGeometryczneRepository.addToRepository( new Czworokat(a,b,c,d));
        }
    }

    public Czworokat(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String toString() {
        return "Czworokąt o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + "obwód: " + Obwod(a,b,c,d);
    }

    public static int Obwod(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
