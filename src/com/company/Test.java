package com.company;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MatchTest {

    @org.junit.jupiter.api.Test
    void The_Challenge_Round() {
        int FirstDiceRoll = 2;
        int SecondDiceRoll = 4;
        int d = FirstDiceRoll + SecondDiceRoll;

        double expectedResult = 6;
        assertEquals(expectedResult, d);
    }

    @org.junit.jupiter.api.Test
    void Who_is_The_Winner() {
        int B1 = 3000;
        int B2 = 2000;                  // int er en primitive datatype som er ikke muterbare værdier i modsætning til objekter og den indholder heltal.
        boolean expectedResult = true;  //boolean er en primitive datatype som indholder værdierne true og false.
         boolean result;
        result = (B1 > B2);
        assertEquals(expectedResult, result);
        }

    }
class AccountTest {

    int Balance = 1000;
    int Tower = 250;
    int BlackCave = -70;
    int Monastery = 0;

    @Test
    void getTower() {
        int expectedResult = 1250;
        int result;
        result = Tower + Balance;
        assertEquals(expectedResult, result);
    }

    @Test
    void getBlack_Cave() {
        int expectedResult = 930;
        int result;
        result = BlackCave + Balance;
        assertEquals(expectedResult, result);

    }

    @Test
    void getMonastery() {
        int expectedResult = 1000;
         int result;
        result = Monastery + Balance;
        assertEquals(expectedResult, result);
    }
}

