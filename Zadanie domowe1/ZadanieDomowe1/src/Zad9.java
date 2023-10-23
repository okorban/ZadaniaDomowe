public class Zad9 {
    public static void main(String[] args) {
        // Napisac program w którym są 3 zmienne:
        //s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
        //k - liczba całkowita - oznacza krok w ciągu arytmetycznym
        //n - liczba całkowita - oznacza ilość elementów ciągu.
        //Program ma zwracać sumę elementów takiego ciągu. Przykład:
        //s = 3, k = 5, n = 4
        //program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
        //3, 8, 13, 18
        //następnie je sumuje i podaje wynik: 42.
        //Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)

        int s = 3;
        int k = 5;
        int n = 4;
        int i = 0;
        int suma = 0;

        for(i = 0; i < n; i++){
            int wyraz = s + i * k;
            System.out.print(wyraz + " ");
            suma = wyraz + suma;

        }
        System.out.println();
        System.out.println("Suma ciągu arytmetycznego to: " + suma);


    }
}
