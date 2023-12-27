package it.camp.dziedziczenie.zadaniedomowe;

public class Prostokat extends Czworokat{

    public Prostokat(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public String toString() {
        return "Prostokąt o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + " pole:  " + Pole(a,b,c,d)
                + " obwód:  " + Obwod(a,b,c,d);
    }

    public static int Pole(int a, int b, int c, int d){
        if(a == b){
            return a * c;
        }
        else return a * b;
    }

}
