package com.bridgelabz.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
    static void getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println(roll);
    }
    public static void main(String[] args) {
        int position = 0;
        System.out.println("the initial position of player one:" + position);
        getDieRoll();
    }
}
