import java.util.Random;

public class Zad6 {
    public static void main(String[] args) {
        // Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
        // Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
        // Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica. Przykłady:
        //3, 23, 2, 23, 53
        //53, 23, 2, 23, 3
        //45, 23, 65, 1, 54
        //54, 1, 65, 23, 45
        //Zakres losowych liczb 0 - 100.

        int[] tab = new int[10];
        int[] tab2 = new int[10];

        for(int i = 0; i < 10; i ++) {

            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,100);

            tab[i] = liczba;
            tab2[9- i] = liczba;
        }

        for(int element : tab){
            System.out.print(element + " ");
        }
        System.out.println();

        for(int element1 : tab2){
            System.out.print(element1 + " ");
        }
    }
}
