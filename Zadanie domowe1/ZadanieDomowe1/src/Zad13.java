import java.util.Random;

public class Zad13 {
    public static void main(String[] args) {
        //Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
        // Program ma sprawdzić czy tablica jest symetryczna - pierwszy element taki jak ostatni,
        // drugi taki jak przedostatni itd. Wynikiem działania programu ma być wypisana wygenerowana tablica
        // oraz true albo false w zależności czy jest symetria czy nie.


        int[] tab = new int[10];

        for( int i = 0; i < 10; i++){
            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,2);
            tab[i] = liczba;
        }

        for(int element : tab){
            System.out.print(element + " ");
        }

        for(int i = 0; i < 6; i++){
            if(tab[0] == tab[tab.length -1 -i]){
                System.out.println("True");
            } else{
                System.out.println("False");
            }
        }

//            if( tab[0] == tab[9] && tab[1] == tab[8] && tab[2] == tab[7] && tab[3] == tab[6] && tab[4] == tab[5]){
//                System.out.println("True");
//            } else{
//                System.out.println("False");
//            }
        }
    }

