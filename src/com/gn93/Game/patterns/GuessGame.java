package com.gn93.Game.patterns;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {

    private static final long serialVersionUID = 1L;

    private GuessGame() {
    }

    private int score;
    private static GuessGame instance = new GuessGame();
    private Scanner sc;
    private Random rn;

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance(){
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

    protected Object readResolve(){
        return instance;
    }


}
