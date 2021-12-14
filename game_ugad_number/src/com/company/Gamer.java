package com.company;

public abstract class Gamer {
    public String gamerName;
    public int helth = 100;

    public Gamer(String gamerName){
        this.gamerName = gamerName;
    }

    abstract public void printInf();
}
