import java.util.Random;

public class Zad4 {
    public static void main(String[] args) {
    /*        Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100).
            Program powinien wypisywać na ekranie wygenerowaną tablicę oraz drugą największą liczbę w tablicy.
            Przykład:
                [1,2,3,4,5,6]
                 5
                [2,3,6,9,34,35}
                 34
                [65,23,76,45,34,12}
                   65*/

        Random losowanie = new Random();

        int[] tab = new int[30];
        int[] tab2 = new int[30];

        for( int i = 0; i < tab.length; i++){
            tab[i] = losowanie.nextInt(0,101);
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        for( int i = 0; i < tab.length ; i ++) {
            if( tab[i] == Max(tab)){
                continue;
            }
            tab2[i] = tab[i];
        }

        System.out.println("Drugi największy element to: " + Max(tab2));

    }

    static int Max(int[] tablica){
        int m = tablica[0];
        for( int i = 1; i < tablica.length; i ++) {
            if (tablica[i] > m) {
                m = tablica[i];
            }
        } return m;
    }

}
