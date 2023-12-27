package it.camp.dziedziczenie.zadaniedomowe;

public class TrojkatRownoramienny extends Trojkat{

    public TrojkatRownoramienny(int a, int b, int c) {
        super(a, b, c);
    }

    public String toString() {
        return "Trójkąt Równoramienny o bokach: "
                +  a + ", "
                + b + ", "
                + c + ", "
                + " pole: " + Pole(a,b,c)
                + " obwód: " + Obwod(a,b,c);
    }

}
