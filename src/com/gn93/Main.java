package com.gn93;

import com.gn93.Game.patterns.GuessGame;

public class Main {

    public static void main(String[] args) {

        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            System.out.println(anotherGameReference.getScore());
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
