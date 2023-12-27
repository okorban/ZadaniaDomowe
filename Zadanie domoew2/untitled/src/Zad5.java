
public class Zad5 {
    public static void main(String[] args) {
        // Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie).
        // Program ma wypisać liczby pierwsze znajdujące się w tej tablicy.
        // Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.

        int[] tab = new int[100];
        boolean[] tab2 = new boolean[100];

        for (int i = 0, j = 2; i < tab.length; i++, j++) {
            tab[i] = j;
            tab2[i] = true;
            System.out.print(tab[i] + " ");
        }

        for(int dzielnik = 2; dzielnik <= tab.length; dzielnik++){
            for(int i = 0; i < tab.length; i++){
                if(tab[i] > dzielnik && tab[i] % dzielnik == 0){
                    tab2[i] = false;
                }
            }
        }

        System.out.println();
        for(int element : tab){
            if(tab2[element -2]){
                System.out.print(element + " ");
            }
        }

    }
}




