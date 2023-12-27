package com.comarch.it.camp.zadanko.domowe;

public class KodBinarny {
    /*Zamiana liczb dziesiętnych na binarne.
    Na tej stronie na początku macie pokazane jak
    zamienia się liczby dziesiętne na binarne:
    https://informatyk.edu.pl/systemy-liczbowe-system-binarny/.
    Napiszcie program który działa rekurencyjnie i wyświetla liczbę w systemie binarnym.*/

    public static String DziesietnyNaBinarny(int a){
        String result = "";
        if(a == 0){
            return "";
        }
        if(a % 2 == 0 ){
            return DziesietnyNaBinarny(a/2) + " " + 0;
        }
        else {
            return DziesietnyNaBinarny(a/2) + " " + 1;
        }

    }



}
