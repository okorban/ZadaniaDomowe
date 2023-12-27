package it.camp.dziedziczenie.zadaniedomowe;

public class PieciokatForemny extends Pieciokat{
    public PieciokatForemny(int a, int b, int c, int d, int e) {
        super(a, b, c, d, e);
    }

    public String toString() {
        return "Pięciokąt foremny o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + e + ", "
                + " pole: " + Pole(a)
                + " obwód:  " + Obwod(a,b,c,d,e);
    }

    public static double Pole(int a){
        return (Math.sqrt(25 + 10 * Math.sqrt(5))* a * a)/4;
    }

}
