public class Zad4 {
    public static void main(String[] args) {
        //Napisz program w którym jest zmienna 'w'. Zmienna ta oznacza wysokość choinki.
        // Program wyświetla na ekranie wypisaną choinkę o danej wysokości. Przykłady:
        //dla w = 3 program wypisuje
        //  *
        // ***
        //*****
        //pierwszy wiersz to: spacja spacja gwiazdka spacja spacja
        //drugi wiersz to: spacja gwiazdka gwiazdka gwiazdka spacja
        //trzeci wiersz to: gwiazdka gwiazdka gwiazdka gwiazdka gwiazdka
        //dla w = 5
        //    *
        //   ***
        //  *****
        // *******
        //*********

        int w = 9;
        int gwiazdki;
        int spacje;
        int temp = 1;


        while(w > 0 || temp <= 2* w - 1 ) {

            for (spacje = 0; spacje < w ; spacje++) {
                System.out.print(" ");
            }
            for (gwiazdki = 0; gwiazdki < temp; gwiazdki++) {
                System.out.print("*");
            }
            for (spacje = 0; spacje < w ; spacje++) {
                System.out.print(" ");
            }
            w -= 1;
            temp +=2;
            System.out.println();

        }

    }
}
