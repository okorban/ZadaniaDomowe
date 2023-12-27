package it.camp.dziedziczenie.zadaniedomowe;

public class Kwadrat extends Czworokat{

    public Kwadrat(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public String toString() {
        return "Kwadrat o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + " pole:  " + Pole(a)
                + " obwód:  " + Obwod(a,b,c,d);
    }

    public static int Pole(int a){
        return a * a;
    }

}
