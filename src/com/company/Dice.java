package com.company;
import java.util.Random;

public class Dice {
    private final static int Sides = 6;

    int RollTheDices() {
        int x;
        Random Generator = new Random();
        x = Generator.nextInt(Sides) + 1;
        return x;
    }

}


