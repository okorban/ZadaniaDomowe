package com.comarch.it.camp.zadanko.domowe;

import java.util.ArrayList;

public class FIFO {
    // Kolejka FIFO. Napisz klasę FIFO która przechowuje Stringi,
    // powinna mieć metody push(String element) która dodaje element do kolejki,
    // oraz metodę pop() która zdejmuje i zwraca element z kolejki.
    // Metody pop i push powinny działać zgodnie z zasami działani kolejki typu FIFO.

    private final ArrayList<String> queue = new ArrayList<>();


    public void push(String str){
        this.queue.add(str);
    }

    public String pop(){
        if(this.queue.isEmpty()) {
            return null;
        } return this.queue.remove(0);
    }

    public String peak(){
        if(this.queue.isEmpty()) {
            return null;
        } return this.queue.get(0);
    }

    // int size()
    public int size(){
        return this.queue.size();
    }

}
