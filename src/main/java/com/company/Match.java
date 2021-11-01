package com.company;
import java.util.Scanner;

public class Match {
    Account B1 = new Account();
    Account B2 = new Account();
    Dice dice = new Dice();
    Players S1;
    Players S2;

// Tekst vises ved spillets start - en række muligheder spillerne kan vælge --> kører på main
    void display() {
        System.out.println();
        System.out.println("One of you will be the champ! Good luck");
        System.out.println("(1) New Game");
        System.out.println("(2) Play a round for player 1");
        System.out.println("(3) Play a round for player 2");
        System.out.println("(4) Exit the game");
        System.out.print("Select an option: ");
    }

    void Option(int Selected) {
        switch (Selected) {
            case 1:
                Instruction();
                break;
            case 2:
                The_Challenge_Round(S1, B1);

                break;
            case 3:
                The_Challenge_Round(S2, B2);
                break;
            default:
                break;

        }

    }

    void Instruction() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Name for player 1: ");
        String TheNameOfPlayer1 = scanner.nextLine();
        System.out.print(" Name for player 2: ");
        String TheNameOfPlayer2 = scanner.nextLine();
        S1 = new Players(TheNameOfPlayer1);
        S2 = new Players(TheNameOfPlayer2);


    }


    void The_Challenge_Round(Players S, Account B) {
        int FirstDiceRoll = this.dice.RollTheDices();
        int SecondDiceRoll = this.dice.RollTheDices();
        int d = FirstDiceRoll + SecondDiceRoll;
        int m;

        System.out.printf("%s rolled %d and %d, "
                        + "and scored %d points. ",
                S.getName(), FirstDiceRoll, SecondDiceRoll,
                d, S.getName());
        System.out.println();

        if (d == 2) {
            m = B.getTower();
            System.out.printf("%s has landed Tower and therefore you win %d points. " + "Your total value is now on %d points", S.getName(), 250, m);
            System.out.println();
            B.setBalance(m);


        }
        if (d == 3) {
            m = B.getCrater();
            System.out.printf("%s has landed Crater and therefore you lose %d points. " + "Your total value is now on %d points", S.getName(), 100, m);
            System.out.println();
            B.setBalance(m);
        }
        if (d == 4) {
            m = B.getPalace_Gates();
            System.out.printf("%s has landed Palace_Gates and therefore you win %d points. " + "Your total value is now on %d points", S.getName(), 100, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 5) {
            m = B.getCold_Desert();
            System.out.printf("%s has landed Cold_Desert and therefore you lose %d points. " + "Your total value is now on %d points", S.getName(), 20, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 6) {
            m = B.getWalled_City();
            System.out.printf("%s has landed Walled_City and therefore you win %d points. " + "Your total value is now on %d points", S.getName(), 180, m);
            System.out.println();
            B.setBalance(m);

        }

        if (d == 7) {
            m = B.getMonastery();
            System.out.printf("%s has landed Monastery and therefore you get %d points. " + "Your total value is now still on %d points", S.getName(), 0, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 8) {
            m = B.getBlack_Cave();
            System.out.printf("%s has landed Black_Cave and therefore you lose %d points. " + "Your total value is now on %d points", S.getName(), 70, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 9) {
            m = B.get_Huts_In_The_Mountain();
            System.out.printf("%s has landed Huts_In_The_Mountain and therefore you win %d points. " + "Your total value is now on %d points", S.getName(), 60, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 10) {
            m = B.get_The_Were_wolf_Wall();
            System.out.printf("%s has landed The_Were_Wolf_Wall and therefore you lose %d points. " + "Your total value is now on %d points, but you get an extra throw!", S.getName(), 80, m);
            System.out.println();
            B.setBalance(m);
            this.The_Challenge_Round(S, B);
            this.dice.RollTheDices();
        }

        if (d == 11) {
            m = B.getThe_Pit();
            System.out.printf("%s has landed The_Pit and therefore you lose %d points. " + "Your total value is now on %d points", S.getName(), 50, m);
            System.out.println();
            B.setBalance(m);
        }

        if (d == 12) {
            m = B.getGold_mine();
            System.out.printf("%s is lucky, you win big! %s has landed Gold_Mine and therefore win a big %d points. " + "Your total value is now on %d points", S.getName(), S.getName(), 650, m);
            System.out.println();
            B.setBalance(m);
        }


    }

    boolean Who_is_The_Winner() {
        int i = 3000;
        if (B1.getBalance() >= i && B2.getBalance() >= i) {
            System.out.println("It is a draw! Both players have exceeded the score limit");
            return true;
        } else if (B1.getBalance() >= i && B2.getBalance() < i) {
            System.out.format("%s Won", S1.getName());
            return true;
        } else if (B1.getBalance() < i && B2.getBalance() >= i) {
            System.out.format("%s Won", S2.getName());
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Match match = new Match();
        while (true) {
            match.display();
            System.out.println();
            Scanner sc = new Scanner(System.in);

            int Selected;
            for (Selected = sc.nextInt(); Selected > 4 || Selected < 0; Selected = sc.nextInt()) {
                System.out.print("Option entered invalid, please enter a number from 1 to 4: ");
            }

            if (Selected == 4) {  //Hvis spilleren vælger nummer 4, som vi kan se på display, så går spilleren ud af spillet
                System.out.println("The game is exited");
                break;
            }

            match.Option(Selected);
            boolean anyoneWin = match.Who_is_The_Winner();
            if (anyoneWin) {
                System.out.println();
                System.out.println("The game is ended.");
                break;
            }
        }

    }
}
