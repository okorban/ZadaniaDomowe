package it.camp.dziedziczenie.zadaniedomowe;

public class SzesciokatForemny extends Szesciokat{

    public SzesciokatForemny(int a, int b, int c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }

    public String toString() {
        return "Szesciokąt foremny o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + e + ", "
                + f + ", "
                + "  pole: " + Pole(a)
                + "  obwód: " + Obwod(a,b,c,d,e,f);
    }

    public static double Pole(int a){
        return (3 * Math.sqrt(3) * a * a)/2;
    }


}
