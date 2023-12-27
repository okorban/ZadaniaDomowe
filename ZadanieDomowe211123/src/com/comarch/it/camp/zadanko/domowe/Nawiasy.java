package com.comarch.it.camp.zadanko.domowe;

public class Nawiasy {
    //Napisz metodę która dostaje jako paramter dowolny string.
    // Program ma sprawdzić czy string zawiera poprawne nawiasy -
    // jeśli tak zwraca true, w przeciwnym wypadku false. Przykład:
    //alskjd(asdfasd)asdf - true
    //asdf(asdf(asdf)asdf - false
    //sdfg(asd)asdf)asdf( - false

    public static boolean Nawiasy(String str){
        boolean otwarty = false;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                otwarty = true;
                count1 ++;
            }
            if(str.charAt(i) == ')'){
                otwarty = false;
                count2 ++;
            }
        }
        return (!otwarty && count1 == count2);
    }
}
