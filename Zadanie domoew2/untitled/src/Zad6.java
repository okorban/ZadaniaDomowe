import java.util.Random;

public class Zad6 {

    // Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7).
    // Program sprawdza czy tablica zawiera duplikaty, jeśli zawiera to generuje nową.
    // Program ma wyświetlić wygenerowaną tablicę bez
    // duplikatów oraz ilość powtórnych generacji tablicy.

    public static void main(String[] args) {

        int iloscGeneracji = 0;
        boolean run = true;
        while (run) {

            int max1 = GeneratorTablicy();
            System.out.println();
            int max2 = GeneratorTablicy();
            System.out.println();

            if (max1 <= 1 && max2 <= 1) {
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
            tablica[i] = losowanie.nextInt(-7, 7);
            System.out.print(tablica[i] + " ");
        }

        int[] countTab = new int[15];
        for (int element : tablica) {
            if( element >= 0) {
                countTab[element]++;
            } else countTab[element + 15]++;
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
