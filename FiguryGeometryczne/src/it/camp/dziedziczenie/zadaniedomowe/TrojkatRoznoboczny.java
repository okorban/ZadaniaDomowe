package it.camp.dziedziczenie.zadaniedomowe;

public class TrojkatRoznoboczny extends Trojkat{

    public TrojkatRoznoboczny(int a, int b, int c) {
        super(a, b, c);
    }

    public String toString() {
        return "Trójkąt Różnoboczny o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + " pole: " + Pole(a,b,c)
                + " obwód: " + Obwod(a,b,c);
    }

}
