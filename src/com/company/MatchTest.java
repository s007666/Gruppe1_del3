package com.company;



import static org.junit.jupiter.api.Assertions.assertEquals;


class MatchTest {

    @org.junit.jupiter.api.Test
    void The_Challenge_Round() {
        double expectedResult = 6;
        int gen = 2;
        int gen1 = 4;
        int result = gen + gen1;
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

