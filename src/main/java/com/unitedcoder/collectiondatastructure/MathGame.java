package com.unitedcoder.collectiondatastructure;


import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many question whould you like to do?");
        int n=scanner.nextInt();
        System.out.println(String.format("You will work on %d questions ",n));
        System.out.println("Lets start the game!!!");
        List<String> questions=new ArrayList<>();
        int x=(int)(Math.random()*10+1);
        int y=(int)(Math.random()*10+1);
        System.out.println(String.format("x=%d y=%d",x,y));
        questions.add("what is x+y ");
        questions.add("what is x-y ");
        questions.add("what is x*y ");
        int point=0;
        for(String question:questions){
            System.out.println(question);
            System.out.println();
            double rightAnswer1=x+y;
            int rightAnswer2=x-y;
            double rightAnswer3=x*y;
            System.out.println("Type your answer ");
            StopWatch watch=new StopWatch();
            watch.start();
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();
            if (watch.getTime(TimeUnit.SECONDS )<= 15) {

                if (questions.indexOf(question) == 0 && number == rightAnswer1) {
                    point++;
                    System.out.println("Your answer was right, point = " + point);
                } else if (questions.indexOf(question) == 1 && number == rightAnswer2) {
                    point++;
                    System.out.println("Your answer was right, point = " + point);
                } else if (questions.indexOf(question) == 2 && number == rightAnswer3) {
                    point++;
                    System.out.println("Your answer was right, point = " + point);
                } else {
                    System.out.println("Your answer was wrong point " + point);
                }
            }
            else {
                System.out.println("Time is out!!!!");
            }
        }
        if(point>=2){
            System.out.println("You win the game!!!");
        }
        else {
            System.out.println("You loose the game!!!");
        }

    }
}
