import java.util.Random;

public class Zad12 {
    public static void main(String[] args) {
        // Napisz program który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości jak w monopoly).
        // Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej
        // (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.

        int[] tab = new int[10000];
        int[] tab2 = new int[13];


        for( int i = 0; i < 10000; i++){
            Random losowanie = new Random();
            int kostka1 = losowanie.nextInt(1,7);
            int kostka2 = losowanie.nextInt(1,7);

            tab[i] = kostka1 + kostka2;

            for(int j = 0; j < 13; j++){
                if( tab[i] == j ){
                    tab2[j] +=1;
                }
        }
        }

            for( int element : tab2){
                System.out.print(element + " ");
            }

            int max = tab2[0];
            int indeks = 0;
        for(int j = 0; j < 13; j++) {
            if (tab2[j] > max) {
                max = tab2[j];
                indeks = j;
            }
        }
        System.out.println();
        System.out.println( indeks + " wystąpiła najwięcej razy: " + max);






       /* int dwojki = 0;
        int trojki = 0;
        int czworki = 0;
        int piatki = 0;
        int szostki = 0;
        int siodemki = 0;
        int osemki = 0;
        int dziewiatki = 0;
        int dziesiatki = 0;
        int jedynastki = 0;
        int dwonastki = 0;

        for( int i = 0; i < 10000; i++){
            if(tab[i] == 2){
                dwojki +=1;
            } else if( tab[i] == 3){
                trojki += 1;
            }  else if( tab[i] == 4){
                czworki += 1;
            }  else if( tab[i] == 5){
                piatki += 1;
            }  else if( tab[i] == 6){
                szostki += 1;
            }  else if( tab[i] == 7){
                siodemki += 1;
            }  else if( tab[i] == 8){
                osemki += 1;
            }  else if( tab[i] == 9){
                dziewiatki += 1;
            }  else if( tab[i] == 10){
                dziesiatki += 1;
            }  else if( tab[i] == 11){
                jedynastki += 1;
            }  else if( tab[i] == 12){
                dwonastki += 1;
            }
            */



        }




    }

