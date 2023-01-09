package com.bridgelabz.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;
        final int ladder = 1;
        final int noPlay = 2;
        final int snake = 3;
        while (position < 100) {
            int dieNum = random.nextInt(6) + 1;
            int options = random.nextInt(4);

            switch (options) {
                case ladder:
                    if (position + dieNum > 100)
                        break;
                    position += dieNum;
                    break;
                case noPlay:
                    break;
                case snake:
                    position -= dieNum;
                    position = Math.max(position, 0);
                    break;

            }

            System.out.println("position is:" + position);
        }
    }
}
