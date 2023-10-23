import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        //Napisz program generujący jednowymiarową tablicę losowych liczb (10 elementów)
        // w której każda liczba jest podzielna przez 7.
        // Wynikiem działania programu ma być wyświetlona tablica. Zakres losowych liczb 0 - 100.


        int[] tab = new int[10];
        int i = 0 ;

//        while( i < 10){
//            Random losowanie = new Random();
//            int losowaLiczba = losowanie.nextInt(0, 101);
//
//            if ( losowaLiczba % 7 == 0){
//                tab[i] = losowaLiczba;
//                i++;
//            } else continue;
//
//        }

//        Random random = new Random();
//        for( i = 0; i < 10; i ++){
//            tab[i] = random.nextInt(0,101);
//            while(tab[i] % 7 != 0 ){
//                tab[i] = random.nextInt(0,101);
//            }
//        }

        while ( i < 10){
            Random losowanie = new Random();
            tab[i] = losowanie.nextInt(0, 15) * 7;
            System.out.println(tab[i]);
            i++;
        }

//        for( int element : tab){
//            System.out.println(element);
//        }
    }
}
