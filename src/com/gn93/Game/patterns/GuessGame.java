package com.gn93.Game.patterns;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public GuessGame() {
    }

    private int score;
    private static GuessGame instance;
    private Scanner sc = new Scanner(System.in);
    private Random rn = new Random();

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance(){

        if(instance == null){
            instance = new GuessGame();
        }

        return instance;
    }

    public void play(Scanner sc, Random rn){

        for (int i = 0; i < 10; i++) {
            int guess = sc.nextInt();
            if(guess == rn.nextInt(9)){
                score++;
                System.out.println("Brawo! Twoj wynik =" + score);
            }
        }

    }


}
