import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
       // Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
        // Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza
        // liczba z tej tablicy. Zakres losowych liczb 0 - 100.


        int[][] tab = new int[5][5];

        for(int i = 0; i < 5; i ++){
            for( int j = 0; j < 5; j ++){
                Random losowanie = new Random();
                int  randNumber = losowanie.nextInt(0, 101);

                tab[i][j] = randNumber;
            }
        }

        int max = tab[0][0];
        for( int[] element : tab ){
            for ( int element1 : element) {

                if(element1 > max){
                    max = element1;
                }
                System.out.print(element1 + " " );
            }
            System.out.println();
        }
        System.out.println("Największy element to: " + max);



    }


}
