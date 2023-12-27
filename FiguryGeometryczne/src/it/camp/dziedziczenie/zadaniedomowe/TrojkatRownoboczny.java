package it.camp.dziedziczenie.zadaniedomowe;

public class TrojkatRownoboczny extends Trojkat{

    public TrojkatRownoboczny(int a, int b, int c) {
        super(a, b, c);
    }

    public String toString() {
        return "Trójkąt Rownoboczny o bokach: "
                + a + ", "
                + b + ", "
                + c + ", "
                + " pole: " + Pole(a,b,c)
                + " obwód: " + Obwod(a,b,c);
    }
}
