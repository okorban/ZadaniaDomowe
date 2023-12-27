import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[1001];

        Random losowacz = new Random();
        for( int i = 0; i < 100; i++){
            tab[i] = losowacz.nextInt(0,1001);
            System.out.print(tab[i] + " ");
        }

 // algorytm wyszukiwania największej liczby
        int max = 0; // można tu czasem wpisać pierwsza liczbę z tabliczy czyli tab[0] lub najmniejszy intiger czyli intiger.nim value
        for ( int element : tab ){
            if( element > max ){
                max = element;
            }
        }
// inna wersja
        int max1 = tab[0];
        for ( int i = 1; i < 100; i ++ ){
            if( tab[i] > max1 ){
                max1 = tab[i];
            }
        }
        System.out.println();
        System.out.println("Największy element to: " + max);

    }
}
