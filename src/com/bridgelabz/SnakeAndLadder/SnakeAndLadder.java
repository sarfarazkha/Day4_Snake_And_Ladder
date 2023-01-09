package com.bridgelabz.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int dieNum = random.nextInt(6) + 1;
        int options = random.nextInt(4);
        int position = 0;
        final int ladder = 1;
        final int noPlay = 2;
        final int snake = 3;
        switch (options) {
            case ladder:
                position += dieNum;
                System.out.println("the player moved by the ladder by:" + position);
                break;
            case noPlay:
                System.out.println("the player remains in the same position:" + position);
                break;
            case snake:
                position -= dieNum;
                System.out.println("the snake had bite the player by:" + position);
                break;

        }
        System.out.println("position is:" + position);
    }
}
