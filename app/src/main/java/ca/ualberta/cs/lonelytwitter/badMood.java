package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xixuan on 1/18/18.
 */


import java.util.Date;


public class badMood extends Mood {
    public badMood(String badMood){
        super(badMood);
    }

    public badMood(String badMood, Date date){
        super(badMood, date);
    }

    @Override
    public void printMood(){
        System.out.println("I am sad.");
    }



}
