package com.company;
import java.util.Random;

public class Terning {
    public final static int Sides = 6;

    public int RollTheDice() {
        int x;
        Random Generator = new Random();
        x = Generator.nextInt(Sides) + 1;
        return x;
    }
}


