package com.gn93.Game.patterns;

public class GuessGame {

    public GuessGame() {
    }

    private int score;
    private static GuessGame instance;

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance(){

        if(instance == null){
            instance = new GuessGame();
        }

        return instance;
    }

    public void play(){

    }


}
