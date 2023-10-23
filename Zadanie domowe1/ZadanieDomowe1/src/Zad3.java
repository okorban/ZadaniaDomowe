import java.util.Random;

public class Zad3 {
    public static void main(String[] args) {
        //Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest
        // losowa ale nie jest mniejsza niż poprzednia liczba. Przykłady:
        //23, 34, 53, 60, 80
        //0, 10, 70, 70, 70
        //nieprawidłowy wynik:
        //34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
        //Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20.
//
//        int[] tab = new int[10];
//
//        Random losowanie = new Random();
//        int losowaLiczba = losowanie.nextInt(0,21);
//
//        tab[0] = losowaLiczba;
//        int max = tab[0];
//        int i = 0;
//
//        while( i < 9){
//
//            int losowaLiczba1 = losowanie.nextInt(0,21);
//            if( losowaLiczba1 >= max ){
//                tab[ i + 1] = losowaLiczba1;
//                i++;
//                max = losowaLiczba1;
//            } else continue;
//        }
//
//        for( int element : tab){
//            System.out.print(element + " ");
//        }

        int[] tab = new int[10];
        Random losowacz = new Random();
//        tab[0] = losowacz.nextInt(0, 101);
//        for (int i = 1; i < tab.length; i++) {
//            tab[i] = losowacz.nextInt(0, 101);
//                while (tab[i] < tab[i - 1]) {
//                    tab[i] = losowacz.nextInt(0, 101);
//                }
//            System.out.println(tab[i]);
//            }

        tab[0] = losowacz.nextInt(0,101);
        for( int i = 1; i < 10; i++){
            tab[i] = losowacz.nextInt(tab[ i - 1],101);
            System.out.println(tab[i]);
        }



    }
}
