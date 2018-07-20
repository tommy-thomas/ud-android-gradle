package org.udandroid.fun;

/**
 * Created by tommy-thomas on 7/16/18.
 */

public class Joke {

    private String Joke;
    private String PunchLine;

    public Joke( String joke, String punchLine){
        Joke = joke;
        PunchLine = punchLine;
    }

    public String getJoke(){
        return Joke;
    }

    public String getPunchLine(){
        return PunchLine;
    }

}
