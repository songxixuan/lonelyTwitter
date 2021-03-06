package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xixuan on 1/18/18.
 */

import java.util.Date;


public class ImportantTweet extends Tweet {

    /**
     *  Represents inportant tweet
     *
     *   @author xixuan
     *
     *   @version 1.0
     */

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet (String message, Date date) {
        super(message,date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}