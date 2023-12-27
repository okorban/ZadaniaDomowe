package com.comarch.it.camp.zadanko;

import com.comarch.it.camp.zadanko.domowe.*;

public class App {
    public static void main(String[] args) {
       // System.out.println(CiagGeometryczny.NTywyrazCiaguGeometrycznego(3,2,5));

       // System.out.println(KodBinarny.DziesietnyNaBinarny(15));

       // System.out.println(Nawiasy.Nawiasy(" "));
/*

        FIFO fifo = new FIFO();
        fifo.push("abc");
        fifo.push("bcd");
        fifo.push("cdf");
        fifo.push("fgh");
        fifo.push("ijk");

        System.out.println(fifo.size());
        System.out.println(fifo.pop());*/

        ZamianaPar zamianaPar = new ZamianaPar();

        String str = "ababcbcbacab";
        String temp = str;
        while(temp.length() > 2){
            String nowyStr = zamianaPar.ZamianaPar(temp);
            System.out.println(nowyStr);
            temp = nowyStr;
        }




    }
}
