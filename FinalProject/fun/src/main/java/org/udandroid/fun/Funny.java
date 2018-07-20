package org.udandroid.fun;


public class Funny {

    private Joke[] mJokeList;

    public Funny(){

        mJokeList = new Joke[] {
                new Joke( "What's black and white and red all over?" , "A newspaper.")
        };
    }

    public Joke getJoke( int i){
        if( i >= 0 && mJokeList[i] != null ){
            return mJokeList[i];
        }
        return new Joke("", "");
    }
}
