package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xixuan on 1/18/18.
 */

import java.util.Date;

public abstract class Mood {
    private Date date;
    private String currentmood;


    public Mood(String currentmood){
        this.date = new Date();
        this.currentmood = currentmood;

    }

    public Mood(String currentmood,Date date){
        this.date = date;
        this.currentmood = currentmood;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMood(){
        return currentmood;
    }

    public void setMood(String mood){
        this.currentmood = mood;
    }

    public abstract void printMood();

}
