package com.comarch.it.camp.zadanko.domowe;

public class NodeFifoPriority {
     private int priority;
     private String str;

    public NodeFifoPriority(String str, int priority) {
        this.priority = priority;
        this.str = str;
    }

    public NodeFifoPriority() {
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
