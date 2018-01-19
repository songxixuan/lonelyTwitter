package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xixuan on 1/18/18.
 */


import java.util.Date;


public class goodMood extends Mood {
    public goodMood(String goodMood){
        super(goodMood);
    }

    public goodMood(String goodMood, Date date){
        super(goodMood, date);
    }

    @Override
    public void printMood(){
        System.out.println("I am good.");
    }



}
