package com.comarch.it.camp.zadanko.domowe;

import java.util.ArrayList;

public class FILO {

    private final ArrayList<String> queue = new ArrayList<>();


    public void push(String str){
        this.queue.add(str);
    }

    public String pop(){
        if(this.queue.isEmpty()) {
            return null;
        } return this.queue.remove(queue.size()-1);
    }

    public String peak(){
        if(this.queue.isEmpty()) {
            return null;
        } return this.queue.get(queue.size()-1);
    }

    // int size()
    public int size(){
        return this.queue.size();
    }

}
