/*
 * copyright <2018> <Team X>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xixuan on 1/18/18.
 */



import java.util.ArrayList;
import java.util.Date;

/**
 *  Represents a tweet
 *
 *   @author xixuan
 *
 *   @version 1.0
 */


public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<Mood> moods;


    /**
     * Constructs a tweet instance using given message
     *
     * @param message the message of the tweet
     *
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<Mood>();
    }

    public Date getDate(){
        /**
         *
         * gets the date of the tweet
         *
         * @param message - the new message of the tweet
         * @throws TweetTooLongException - is thrown when the message is over 140 characters
         * @see ImportantTweet
         * @see NormalTweet
         */
        return date;
    }

    public void setDate(Date date){
        /**
         *
         * sets the date of the tweet
         *
         * @param message - the new message of the tweet
         * @throws TweetTooLongException - is thrown when the message is over 140 characters
         * @see ImportantTweet
         * @see NormalTweet
         */
        this.date = date;
    }

    public String getMessage(){
        /**
         *
         * gets the message of the tweet
         *
         * @param message - the new message of the tweet
         * @throws TweetTooLongException - is thrown when the message is over 140 characters
         * @see ImportantTweet
         * @see NormalTweet
         */
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        /**
         *
         * sets the message of the tweet
         *
         * @param message - the new message of the tweet
         * @throws TweetTooLongException - is thrown when the message is over 140 characters
         * @see ImportantTweet
         * @see NormalTweet
         */

        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();

    public void addMood(Mood mood){
        this.moods.add(mood);
    }
}