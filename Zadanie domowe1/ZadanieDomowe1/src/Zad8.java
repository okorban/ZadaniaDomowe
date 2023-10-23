import java.util.Random;

public class Zad8 {
    public static void main(String[] args) {
        // .Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
        // Wynikiem działania programu mają być wypisane obie tablice,
        // oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic. Przykład:
        //1 4 4 64 45
        //23 32 5 23 3
        //24 36 9 87 48

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[10];

        for( int i = 0; i < 10; i++){

            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,101);

            tab1[i] = liczba;
        }

        for( int j = 0; j < 10; j++){

            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,101);

            tab2[j] = liczba;
        }

        for( int k = 0; k < 10; k++){
            tab3[k] = tab2[k] + tab1[k];

        }

        for( int element : tab1){
            System.out.print(element + " ");
        }
        System.out.println();

        for( int element : tab2){
            System.out.print(element + " ");
        }
        System.out.println();

        for( int element : tab3){
            System.out.print(element + " ");
        }
    }
}
