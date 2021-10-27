package com.company;


public class Account {
//Integer værdier for Pengebeholdning fra kranspec.
    int Balance;
    int Tower = 250;
    int Crater = -100;
    int Palace_Gates = 100;
    int Cold_Desert = -20;
    int WalledCity = 180;
    int Monastery = 0;
    int BlackCave = -70;
    int HutsInTheMountain = 60;
    int TheWerewolfWall = -80;  //Player gets an extra throw.
    int ThePit = -50;
    int Goldmine = 650;


    public Account() {
        Balance = 1000;
    }

    public int getTower() {
        return Tower + Balance;
    }

    public int getCrater() {
        return Balance + Crater;
    }

    public int getPalace_Gates() {
        return Balance + Palace_Gates;
    }

    public int getCold_Desert() {
        return Balance + Cold_Desert;
    }

    public int getWalled_City() {
        return Balance + WalledCity;
    }

    public int getMonastery() {
        return Balance + Monastery;
    }

    public int getBlack_Cave() {
        return Balance + BlackCave;
    }

    public int get_Huts_In_The_Mountain() {
        return Balance + HutsInTheMountain;
    }

    public int get_The_Were_wolf_Wall() {
        return Balance + TheWerewolfWall;
    }

    public int getThe_Pit() {
        return Balance + ThePit;
    }

    public int getGold_mine() {
        return Balance + Goldmine;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}

