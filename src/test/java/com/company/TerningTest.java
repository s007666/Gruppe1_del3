package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TerningTest {

    @Test
    public void rollTheDice() {

        Terning dice = new Terning();
        ArrayList<Integer> kast = new ArrayList<>();
        for (int i = 0; i < 1000; i++) { //Her er der blevet Terning testet med 1000 kast.
            int roll = dice.rollTheDice();
            kast.add(roll);
        }

        System.out.println(kast.size()); //Her får vi programmeret til at printe ud hvor mange gange vi tester kastning af terning.
        Tællefrekvenser(kast);
    }

    //Her tester vi hvor mange gange man rammer siderne på en terning fra 1-6.
    public void Tællefrekvenser(ArrayList<Integer> list) {
        Set<Integer> st = new HashSet<>(list);
        for (Integer n : st)
            System.out.println(n + ": " + Collections.frequency(list, n));
    }
}

