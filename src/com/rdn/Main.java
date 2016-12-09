package com.rdn;

public class Main {

    public static void main(String[] args) {
        Boolean myBoo = true;
        if (myBoo == false)
            System.out.println("you are correct");
        else
            System.out.println("stop playing");

        int firstScore = 50;
        if (firstScore > 100)
            System.out.println("That is pretty awesome");
        int secondScore = 60;
        if (firstScore > secondScore && secondScore >100)
            System.out.println("shit just got real");
        else
            System.out.println("this is just getting out of control");
    }
}
