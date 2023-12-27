import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        //Napisz program który generuje 10 elementową tablicę liczb (0 - 100)
        // a następnie przesuwa tą tablicę o 3 elementy w prawo.
        // Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę. Przykład:
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //[8, 9, 10, 1, 2, 3, 4, 5, 6, 7]

        Random losowanie = new Random();

        int[] tab = new int[10];
        int[] tab2 = new int[10];


        for (int i = 0; i < tab.length; i++) {
            tab[i] = losowanie.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for( int i = 0; i < tab.length; i ++){
            if( i + 3 < tab.length){
                tab2[i + 3] = tab[i];
            } else {
                tab2[i - tab.length + 3] = tab[i];
            }
        }

        for( int element : tab2){
            System.out.print(element + " ");
        }







    }
}

