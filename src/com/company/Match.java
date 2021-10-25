package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Match {
    private Players S1;
    private Players S2;
    private Dice dice;


    void displayMatchMenu() {
        System.out.println();
        System.out.println("(1) Start a new game");
        System.out.println("(2) Play a round");
        System.out.println("(3) Who is leading now?");
        System.out.println("(4) test 1000 throw");
        System.out.println("(5) Exit the game");
        System.out.print("Selcet an option: ");
    }

    void selectMatchOption(int optionSelected) {
        switch(optionSelected) {
            case 1:
                this.ShowMatchInstruction();
                break;
            case 2:
                this.playOneRound(this.S1);
                this.playOneRound(this.S2);
                break;
            case 3:
                this.whoIsLeading();
                break;
            case 4:
                this.test(this.S1);
        }

    }

    void ShowMatchInstruction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the first player: ");
        String P1Navn = sc.nextLine();
        System.out.print("Please enter the name of the second player: ");
        String P2Navn = sc.nextLine();
        this.S1 = new Players(P1Navn);
        this.S2 = new Players(P2Navn);
        this.dice = new Dice();
    }

    public static void countFrequencies(ArrayList<Integer> list) {
        Set<Integer> st = new HashSet(list);
        Iterator var2 = st.iterator();

        while(var2.hasNext()) {
            Integer s = (Integer)var2.next();
            System.out.println(s + ": " + Collections.frequency(list, s));
        }

    }

    void test(Players n) {
        ArrayList<Integer> rolls = new ArrayList();

        for(int i = 0; i < 1000; ++i) {
            int gen = this.dice.RollTheDices();
            int gen1 = this.dice.RollTheDices();
            int result = Integer.sum(gen, gen1);
            rolls.add(result);
        }

        Collections.sort(rolls);
        System.out.println(rolls);
        System.out.println(rolls.size());
        countFrequencies(rolls);
    }

    void playOneRound(Players p) {
        int FirstTerningKast = this.dice.RollTheDices();
        int AndenTerningKast = this.dice.RollTheDices();
        int result = FirstTerningKast + AndenTerningKast;
        p.setTotalPoints(result);
        System.out.printf("%s rolled %d and %d, and scored %d points, for a total of %d points", p.getName(), FirstTerningKast, AndenTerningKast, result, p.getTotalPoints());
        System.out.println();
    }

    void whoIsLeading() {
        if (this.S1.getTotalPoints() == this.S2.getTotalPoints()) {
            System.out.format("Its currently a draw, %s has %d, %s has %d", this.S1.getName(), this.S1.getTotalPoints(), this.S2.getName(), this.S2.getTotalPoints());
        } else if (this.S1.getTotalPoints() > this.S2.getTotalPoints()) {
            System.out.printf("%s is leading, %s has %d points, %s has %d points", this.S1.getName(), this.S1.getName(), this.S1.getTotalPoints(), this.S2.getName(), this.S2.getTotalPoints());
        } else if (this.S1.getTotalPoints() < this.S2.getTotalPoints()) {
            System.out.format("%s is leading, %s has %d points, %s has %d points.", this.S2.getName(), this.S2.getName(), this.S2.getTotalPoints(), this.S1.getName(), this.S1.getTotalPoints());
        }

    }


    boolean CheackIfSomeoneWin() {
        if (this.S1.getTotalPoints() >= 3000 && this.S2.getTotalPoints() >= 3000) {
            System.out.println("It is a draw! Both players have exceeded the score limit");
            return true;
        } else if (this.S1.getTotalPoints() >= 3000 && this.S2.getTotalPoints() < 3000) {
            System.out.format("%s Won", this.S1.getName());
            return true;
        } else if (this.S1.getTotalPoints() < 3000 && this.S2.getTotalPoints() >= 3000) {
            System.out.format("%s Won", this.S2.getName());
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Dice and Roll game!");
        Match match = new Match();

        while(true) {
            match.displayMatchMenu();
            System.out.println();
            Scanner sc = new Scanner(System.in);

            int optionSelected;
            for(optionSelected = sc.nextInt(); optionSelected > 5 || optionSelected < 0; optionSelected = sc.nextInt()) {
                System.out.print("Option entered invalid, please enter a number from 1 to 5: ");
            }

            if (optionSelected == 5) {
                System.out.println("The game is exited");
                break;
            }

            match.selectMatchOption(optionSelected);
            boolean anyoneWin = match.CheackIfSomeoneWin();
            if (anyoneWin) {
                System.out.println();
                System.out.println("The game is ended.");
                break;
            }
        }

    }
}
