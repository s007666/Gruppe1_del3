package com.company;


public class Players {


    private String name;
    private int totalPoints;


    public Players(String name) {
        this.name = name;


    }


    public String getName() {
        return name;

    }
    int getTotalPoints(){
        return totalPoints;
    }

    void setTotalPoints(int points){
        totalPoints += points;
    }
}

