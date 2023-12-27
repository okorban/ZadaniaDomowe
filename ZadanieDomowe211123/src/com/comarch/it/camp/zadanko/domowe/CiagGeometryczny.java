package com.comarch.it.camp.zadanko.domowe;

public class CiagGeometryczny {

    //Program który wylicza n-ty element ciągu geometrycznego.
    // Na wejściu program dostaje pierwszy wyraz ciągu,
    // iloraz i numer wyrazu który ma wyliczyć.
    // Krótka teoria jak działa ciąg geometryczny: https://pl.wikipedia.org/wiki/Ciąg_geometryczny.
    // Przykład:
    //Wejście
    //3 2 5
    //Wynik
    //48

    public static int NTywyrazCiaguGeometrycznego(int a, int q, int n){
        return (int) (a * Math.pow(q,n-1));
    }
}
