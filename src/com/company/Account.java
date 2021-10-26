package com.company;


public class Account {

    private int Balance;
    int Tower = 250;
    int Crater = 100;
    int PalaceGates = 100;
    int ColdDesert = 20;
    int WalledCity = 180;
    int Monastery = 0;
    int BlackCave = 70;
    int HutsInTheMountain = 60;
    int TheWerewolfWall = 80;  //Spilleren får en ekstra tur.
    int ThePit = 50;
    int Goldmine = 650;


    public Account() {
        Balance = 1000;
    }

    public int getTower() {
        return Tower + Balance;
    }

    public int getCrater() {
        return Balance - Crater;
    }

    public int getPalaceGates() {
        return Balance + PalaceGates;
    }

    public int getColdDesert() {
        return Balance - ColdDesert ;
    }

    public int getWalledCity() {
        return Balance + WalledCity;
    }

    public int getMonastery() {
        return Balance + Monastery;
    }

    public int getBlackCave() {
        return Balance - BlackCave;
    }

    public int getHutsInTheMountain() {
        return Balance + HutsInTheMountain;
    }

    public int getTheWerewolfWall() {
        return Balance - TheWerewolfWall;
    }

    public int getThePit() {
        return Balance - ThePit;
    }

    public int getGoldmine() {
        return Balance + Goldmine;
    }
    void setTotalPoints(int points){
        Balance += points;

    }
   public int getTotalPoints(){
       return Balance ;

    }
}

