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
        if ((firstScore > 40) || (secondScore < 60))
            System.out.println("I think I got this right?");
        else
            System.out.println("this is just getting out of control");

        int testValue = 50;
        if (testValue == 51)
            System.out.println("you got a fiddy");
        else
            System.out.println("you broke®");

        boolean isTaco = true;
        if (isTaco == true)
            System.out.println("free taco for everyone");

        isTaco = true;
        boolean wasTaco = isTaco ? true : false;
        if (wasTaco)
            System.out.println("is true");
        else
            System.out.println("is false");

        /*
        This is the Challange
         */
        double firstValue = 20d;
        double secondValue = 80d;
        double totalValue = (firstValue + secondValue) * 25;
        double remainderValue = totalValue % 40;

        if (remainderValue <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("You good!");

    }
}
