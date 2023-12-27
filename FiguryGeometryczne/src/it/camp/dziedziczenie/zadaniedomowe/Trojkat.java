package it.camp.dziedziczenie.zadaniedomowe;

import it.camp.dziedziczenie.db.FiguryGeometryczneRepository;
import it.camp.dziedziczenie.model.Figura;

public class Trojkat extends Figura {
    int a;
    int b;
    int c;


    public Trojkat(int[] tablicaLiczb) {
        this.a = tablicaLiczb[0];
        this.b = tablicaLiczb[1];
        this.c = tablicaLiczb[2];
        CheckWhichTriangle(a,b,c);
    }

    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void CheckWhichTriangle(int a, int b, int c){
        if(a == b && a == c ){
            FiguryGeometryczneRepository.addToRepository( new TrojkatRownoboczny(a, b, c));
        } else if((a == b )
                || (c == b )
                || a == c  ){
            FiguryGeometryczneRepository.addToRepository( new TrojkatRownoramienny(a, b, c));
        } else{
            FiguryGeometryczneRepository.addToRepository( new TrojkatRoznoboczny(a, b, c));
        }
    }

    public static double Pole(int a,int b,int c) {
        int p = Obwod(a,b,c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static int Obwod(int a, int b, int c){
        return a + b + c;
    }
}
