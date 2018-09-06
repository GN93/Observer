package com.gn93.Game.patterns;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private GuessGame() {
    }

    private int score;
    private static GuessGame instance;
    private Scanner sc;
    private Random rn;

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance(){

        if(instance == null){
            synchronized (GuessGame.class){
                if(instance == null)
                    instance = new GuessGame();
            }
        }

        return instance;
    }

    public void play(){
        int selectedNumber;
        int randomNumber;
        sc = new Scanner(System.in);
        rn = new Random();
        for (int i = 0; i < 10; i++) {
            selectedNumber = sc.nextInt();
            randomNumber = rn.nextInt(9);
            if(selectedNumber == randomNumber){
                score++;
                System.out.println("Brawo! Wybrałeś: " + selectedNumber + ", wylosowano: " + randomNumber + ". Wynik: " + score);
            }
        }

    }


}
