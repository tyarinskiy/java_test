package com.company;

public abstract class Gamer {
    private String myName;
    private String animyName;
    private int number;

    public String getMyName(){
        return myName;
    }
    public String getAnimyName(){
        return animyName;
    }
    public Gamer (String myName){
        this.myName = myName;
//      this.animyName = animyName;
    }
    public Gamer (String animyName){
  //      this.myName = myName;
        this.animyName = animyName;
    }

    public int getNumber () {
        return number;
    }
    public abstract void printInfo ();





}
