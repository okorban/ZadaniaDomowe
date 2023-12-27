import java.util.Random;
        ;

public class Zadanie3 {
    public static void main(String[] args) {


//// deklarujemy sobie obiekt Rnadom
//// metoda nextInt mow zeby losowacz wybral sobie nastepna liczbe calkowita
//// to tak naprawde jest pseudo losowa liczba
//
//        Random losowacz = new Random();
//        int losowaLiczba = losowacz.nextInt(0, 101); // w nawiasach mam zakres, jak chcemy zorbic miedzy np -50 a 50
//        // int losowaLiczba = losowacz.nextInt(101) - 50 - wtedy mamy liczny od - 50 do 50
//
//        System.out.println(losowaLiczba);


// uzupełniamy tablice losowymi liczbami
        int[] tab = new int[100];
        Random losowacz = new Random(); // to wyrzucamy przed petle żeby nie tworzyz za każym razme nowego losowacza
        for( int i = 0; i < 100; i++){
            tab[i] = losowacz.nextInt(0,101);
            System.out.println(tab[i]);
        }
// liczenie średniej, możeliwe że będzie koło 50 bo w Randome mamy rozkład normalny (czyli rowne prawdopodobieństwo)
// robimy to pętlą for each, bo nie chcemy nic zmieniac, tylko sobie zaglądamy tam do tablicy

        int suma = 0;
        for (int element : tab ){
            suma += element;
        }
        double srednia = (double) suma/100; // lub można sobie napisać 100.0
        System.out.println("Średnia to: " + srednia);






    }
}
