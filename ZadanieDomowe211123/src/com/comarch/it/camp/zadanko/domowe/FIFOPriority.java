package com.comarch.it.camp.zadanko.domowe;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FIFOPriority {
    //Kolejka priorytetowa.
    // Napisz klase FIFOPriority która przechowuje Stringi.
    // Kolejka ma działać zgodnie z zasadami kolejki FIFO jednak elementy mają mieć priorytety.
    // Klasa posiada metodę push(String element, int priority).
    // Metoda dodaje element na koniec kolejki z zadanym priorytetem (0 najmniejszy priorytet, 99 najwyższy priorytet).
    // Klasa posiada metodę popFirst() zwracającą pierwszego stringa w kolejce,
    // popHighThree() zwracającą jednego z 3 pierwszych Stringów -
    // tego o najwyższym priorytecie najwyższym priorytecie,
    // jeśli są dwa elementy o tym samym priorytecie zwracany
    // jest ten który stoi bliżej "wyjścia" z kolejki.
    // Klasa powinna posiadać również metodę popHighest()
    // zwracajacą stringa o najwyższym priorytecie w całej kolejce.
    // Jeśli jest wiecej niż jeden element o najwyższym priorytecie metoda
    // zwraca element który stoi najbliżej "wyjścia" z kolejki.

    private final ArrayList<NodeFifoPriority> queuePriority = new ArrayList<>();
    NodeFifoPriority nodeFifoPriority = new NodeFifoPriority();


    public void push(String str, int priority){
        NodeFifoPriority node = new NodeFifoPriority(str, priority);
        this.queuePriority.add(node);
    }

    public String popFirst(){
        if(this.queuePriority.isEmpty()) {
            return null;
        } return this.queuePriority.remove(0).toString();
    }

    public String peak(){
        if(this.queuePriority.isEmpty()) {
            return null;
        } return this.queuePriority.get(0).toString();
    }

    // int size()
    public int size(){
        return this.queuePriority.size();
    }

    public String popHighest(){
        if(this.queuePriority.isEmpty()) {
            return null;
        } return String.valueOf(this.queuePriority.remove(findHighestPriority()));

    }

    public String popHighThree(){
        NodeFifoPriority first = queuePriority.get(0);
        NodeFifoPriority second = queuePriority.get(1);
        NodeFifoPriority third = queuePriority.get(2);

        if(first.getPriority() >= second.getPriority() && first.getPriority() >= third.getPriority()){
            return String.valueOf(this.queuePriority.remove(first));
        } else if( second.getPriority() >= third.getPriority()){
            return String.valueOf(this.queuePriority.remove(second));
        } else return String.valueOf(this.queuePriority.remove(third));
    }

    public NodeFifoPriority findHighestPriority(){
        int max = 0;
        NodeFifoPriority nodeMax = new NodeFifoPriority();
        for(NodeFifoPriority node : this.queuePriority){
            if(node.getPriority() > max){
                max = node.getPriority();
            }
        }
        for(NodeFifoPriority node : this.queuePriority){
            if(node.getPriority() == max){
                nodeMax = node;
                break;
            }
        }
        return nodeMax;
    }


}
