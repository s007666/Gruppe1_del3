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
    private Account B1;
    private Account B2;
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
        switch (optionSelected) {
            case 1:
                this.ShowMatchInstruction();
                break;
            case 2:
                this.playOneRound(this.S1 ,this.B1);
                this.playOneRound(this.S2, this.B2);
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
        this.B1 = new Account();
        this.B2 = new Account();
        this.dice = new Dice();
    }

    public static void countFrequencies(ArrayList<Integer> list) {
        Set<Integer> st = new HashSet(list);
        Iterator var2 = st.iterator();

        while (var2.hasNext()) {
            Integer s = (Integer) var2.next();
            System.out.println(s + ": " + Collections.frequency(list, s));
        }

    }

    void test(Players n) {
        ArrayList<Integer> rolls = new ArrayList();

        for (int i = 0; i < 1000; ++i) {
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

    void playOneRound(Players S , Account B) {
        int FirstDiceRoll = this.dice.RollTheDices();
        int SecondDiceRoll = this.dice.RollTheDices();
        int d = FirstDiceRoll + SecondDiceRoll;
        int m = B.getTotalPoints();

        int m1 = B.getTower();
        System.out.printf("%s rolled %d and %d, "
                        + "and scored %d points, "
                        + "%s has a starting value of %d points",
                S.getName(), FirstDiceRoll, SecondDiceRoll,
                d, S.getName() ,m);
        System.out.println();

        if (d == 2) {
            System.out.printf("%s er landet på Tower og derfor vinder du %d points. " + "Din total værdi er nu på %d points", S.getName(), 250, m1);
            System.out.println();
        }
        int m2 = B.getCrater();
        if (d == 3) {
            System.out.printf("%s er landet på Crater og derfor mister du %d points. " + "Din total værdi er nu på %d points", S.getName(), 100, m2);
            System.out.println();
        }
        int m3 = B.getPalaceGates();
        if (d == 4) {
            System.out.printf("%s er landet på Palace gates og derfor vinder du %d points. " + "Din total værdi er nu på %d points", S.getName(), 100, m3);
            System.out.println();
        }
        int m4 = B.getColdDesert();
        if (d == 5) {
            System.out.printf("%s er landet på Cold Desert og derfor mister du %d points. " + "Din total værdi er nu på %d points", S.getName(), 20, m4);
            System.out.println();
        }
        int m5 = B.getWalledCity();
        if (d == 6) {
            System.out.printf("%s er landet på Walled City og derfor vinder du %d points. " + "Din total værdi er nu på %d points", S.getName(), 180, m5);
            System.out.println();
        }
        int m6 = B.getMonastery();
        if (d == 7) {
            System.out.printf("%s er landet på Monastery og derfor får du %d points. " + "Din total værdi er nu stadig på %d points", S.getName(), 0, m6);
            System.out.println();
        }
        int m7 = B.getBlackCave();
        if (d == 8) {
            System.out.printf("%s er landet på Black Cave og derfor mister du %d points. " + "Din total værdi er nu på %d points", S.getName(), 70, m7);
            System.out.println();
        }
        int m8 = B.getHutsInTheMountain();
        if (d == 9) {
            System.out.printf("%s er landet på Huts in the mountain og derfor vinder du %d points. " + "Din total værdi er nu på %d points", S.getName(), 60, m8);
            System.out.println();
        }
        int m9 = B.getTheWerewolfWall();
        if (d == 10) {
            System.out.printf("%s er landet på The were wolf wall og derfor mister du %d points. " + "Din total værdi er nu på %d points", S.getName(), 80, m9, ", men du får et ekstra tur");
            System.out.println();
            this.playOneRound(S,B);
              this.dice.RollTheDices();
        }
        int m10 = B.getThePit();
        if (d == 11) {
            System.out.printf("%s er landet på The pit og derfor mister du %d points. " + "Din total værdi er nu på %d points", S.getName(), 50, m10);
            System.out.println();
        }
        int m11 = B.getGoldmine();
        if (d == 12) {
            System.out.printf("%s er landet på Gold mine og derfor vinder du stort %d points. " + "Din total værdi er nu på %d points", S.getName(), 650, m11);
            System.out.println();
        }


        }

    void whoIsLeading() {

        if (this.B1.getTotalPoints() == this.B2.getTotalPoints()) {
            System.out.printf("Its currently a draw, %s has %d, %s has %d", this.S1.getName(), this.B1.getTotalPoints(), this.S2.getName(), this.B2.getTotalPoints());
        } else if (this.B1.getTotalPoints() > this.B2.getTotalPoints()) {
            System.out.printf("%s is leading, %s has %d points, %s has %d points", this.S1.getName(), this.S1.getName(), this.B1.getTotalPoints(), this.S2.getName(), this.B2.getTotalPoints());
        } else if (this.B1.getTotalPoints()< this.B2.getTotalPoints()) {
            System.out.printf("%s is leading, %s has %d points, %s has %d points.", this.S2.getName(), this.S2.getName(), this.B2.getTotalPoints(), this.S1.getName(), this.B1.getTotalPoints());
        }

    }


    boolean CheackIfSomeoneWin() {
        if (B1.getTotalPoints() >= 3000 && this.B2.getTotalPoints() >= 3000) {
            System.out.println("It is a draw! Both players have exceeded the score limit");
            return true;
        } else if (this.B1.getTotalPoints() >= 3000 && this.B2.getTotalPoints() < 3000) {
            System.out.format("%s Won", this.S1.getName());
            return true;
        } else if (this.B1.getTotalPoints() < 3000 && this.B2.getTotalPoints() >= 3000) {
            System.out.format("%s Won", this.S2.getName());
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Dice and Roll game!");
        Match match = new Match();

        while (true) {
            match.displayMatchMenu();
            System.out.println();
            Scanner sc = new Scanner(System.in);

            int optionSelected;
            for (optionSelected = sc.nextInt(); optionSelected > 5 || optionSelected < 0; optionSelected = sc.nextInt()) {
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
