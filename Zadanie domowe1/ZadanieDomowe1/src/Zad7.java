import java.util.Random;

public class Zad7 {
    public static void main(String[] args) {
//        Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
//        Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowanych.
//        Przykład:
//        3, 5, 12, 34, 45
//        45, 21, 65, 23, 1
//        3, 5, 12, 34, 45, 45, 21, 65, 23, 1

        int[] tab = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[20];

        for( int i = 0; i < 10; i++){
            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,100);
            tab[i] = liczba;
            tab3[i] = liczba;
        }


        for( int i = 0, k = 10 ; i < 10; i++, k++){
            Random losowanie = new Random();
            int liczba = losowanie.nextInt(0,100);
            tab2[i] = liczba;
            tab3[k] = liczba;
        }
        for(int element: tab){
            System.out.print(element + " " );
        }

        System.out.println();

        for(int element: tab2) {
            System.out.print(element + " ");
        }

        System.out.println();

        for(int element: tab3){
            System.out.print(element + " " );
        }



    }
}
