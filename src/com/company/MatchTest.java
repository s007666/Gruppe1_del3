package com.company;



import static org.junit.jupiter.api.Assertions.assertEquals;


class MatchTest {


    @org.junit.jupiter.api.Test
    void The_Challenge_Round() {
        int FirstDiceRoll = 2;
        int SecondDiceRoll = 4;
        int d = FirstDiceRoll + SecondDiceRoll;

        int result = d;
        double expectedResult = 6;
        assertEquals(expectedResult, result);
    }


    @org.junit.jupiter.api.Test
    void Who_is_The_Winner() {
        int B1 = 3000;
        int B2 = 2000;
        boolean expectedResult = true;
        boolean result;
        if (B1 > B2) result = true;
        else result = false;
        assertEquals(expectedResult, result);
        }

}

