import java.util.Random;

public class Zad7 {
// Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20).
// Program ma sprawdzić czy w każdej z tablic znajdują się 3 takie same elementy,
// jeśli nie to generuje tablice ponownie.
// Program ma wypisywać wygenerowane tablice oraz ilość ponownych generacji tablic.


    public static void main(String[] args) {

        int iloscGeneracji = 0;
        boolean run = true;
        while (run) {

            int max1 = GeneratorTablicy();
            System.out.println();
            int max3 = GeneratorTablicy();
            System.out.println();
            int max2 = GeneratorTablicy();
            System.out.println();


            if (max1 >= 3 && max2 >= 3 && max3 >= 3) {
                run = false;
            } else {
                iloscGeneracji++;
            }
        }

        System.out.println(" Ilość generacji tablicy: " + iloscGeneracji);


    }

    public static int GeneratorTablicy() {
        Random losowanie = new Random();
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = losowanie.nextInt(-20, 20);
            System.out.print(tablica[i] + " ");
        }

        int[] countTab = new int[41];
        for (int element : tablica) {
            if( element >= 0) {
                countTab[element]++;
            } else countTab[element + 41]++;
        }

        int max = countTab[0];
        for (int i = 1; i < countTab.length; i++) {
            if (countTab[i] > max) {
                max = countTab[i];
            }
        }
        return max;
    }
}



