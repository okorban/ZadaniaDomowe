package com.comarch.it.camp.zadanko.domowe;

public class ZamianaPar {
    //DLA CHĘTNYCH - trochę trudniejsze zadanie.
    // Na wejściu program dostaje dowolny string który
    // składa się tylko z liter a, b i c np. aaabbcbcbcbabab.
    // Program ma zrobić redukcję tego stringa.
    // Jak działa redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b,
    // bc i cb zamieniane jest na a. Program ma redukować stringa maksymalnie jak się da.
    // Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
    // Program wyświetla a.  Możecie też sprawdzić co się stanie w takich sytuacjach:
    //najpierw będziecie zamieniać pary ab i ba później ac i ca i na końcu bc i cb
    //najpierw bc i cb, później ac i ca i na końcu ab i ba
    //dowolna inna kombinacja kolejności.

    public String ZamianaPar(String str){
        if(str.length() < 2){
            return str;
        }
        for(int i = 0; i < str.length()-1;i++){
            if(str.substring(i,i+2).equals("ab") || str.substring(i,i+2).equals("ba")) {
                return "c" + ZamianaPar(str.substring(i + 2, str.length()));
            } else if(str.substring(i,i+2).equals("ac") || str.substring(i,i+2).equals("ca")) {
                return "b" + ZamianaPar(str.substring(i + 2, str.length()));
            } else if(str.substring(i,i+2).equals("bc") || str.substring(i,i+2).equals("cb")) {
                return "a" + ZamianaPar(str.substring(i + 2, str.length()));
            }
        }
        return str.charAt(0) + ZamianaPar(str.substring(1,str.length()));
    }

}
