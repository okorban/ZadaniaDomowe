import java.util.Random;

public class Zad5 {
    public static void main(String[] args) {
        // Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
        // Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5.
        // Zakres losowych liczb 0 - 10.

        int[] tab = new int[10];

        for(int i = 0; i <10; i++) {
            Random losowanie = new Random();
            int losowaLiczba = losowanie.nextInt(1, 10);

            tab[i] = losowaLiczba;
        }

        int ile = 0;
        for(int element : tab){
            System.out.print(element + " ");
            if( element == 5){
                ile +=1 ;
            }

        }
        System.out.println();
        System.out.println("Tyle jest piątek: " + ile);




    }
}
