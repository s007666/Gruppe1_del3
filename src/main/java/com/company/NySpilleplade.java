package com.company;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;


public class NySpilleplade {
    public static void main(String[] args) {
        // Laver hvert felt svarende til spillepladen
        GUI_Field[] fields = {
                new GUI_Start(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Tax(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Tax(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),

        };

        GUI gui = new GUI(fields);
        //ændre beskrivelserne til hvert felt
        // start feltet
        gui.getFields()[0].setTitle("START");
        gui.getFields()[0].setSubText("");
        gui.getFields()[0].setForeGroundColor(Color.BLACK);
        gui.getFields()[0].setBackGroundColor(Color.LIGHT_GRAY);
        gui.getFields()[0].setDescription("Modtag M2, når du passerer");

        //felt 1
        gui.getFields()[1].setTitle("Burgerbaren");
        gui.getFields()[1].setSubText("M1");
        gui.getFields()[1].setForeGroundColor(Color.BLACK);
        gui.getFields()[1].setBackGroundColor(Color.GREEN);
        gui.getFields()[1].setDescription("Du landede på burgerbaren");

        //felt 2
        gui.getFields()[2].setTitle("Pizzahuset");
        gui.getFields()[2].setSubText("M1");
        gui.getFields()[2].setForeGroundColor(Color.BLACK);
        gui.getFields()[2].setBackGroundColor(Color.GREEN);
        gui.getFields()[2].setDescription("Du landede på pizzahuset");
        //felt 3
        gui.getFields()[3].setTitle("Prøv Lykken");
        gui.getFields()[3].setSubText("");
        gui.getFields()[3].setForeGroundColor(Color.BLACK);
        gui.getFields()[3].setBackGroundColor(Color.ORANGE);
        gui.getFields()[3].setDescription("Prøv lykken kort");

        //felt 4
        gui.getFields()[4].setTitle("Slikbutikken");
        gui.getFields()[4].setSubText("M1");
        gui.getFields()[4].setForeGroundColor(Color.BLACK);
        gui.getFields()[4].setBackGroundColor(Color.BLUE);
        gui.getFields()[1].setDescription("Du landede på slikbutikken");

        //felt 5
        gui.getFields()[5].setTitle("Iskiosken");
        gui.getFields()[5].setSubText("M1");
        gui.getFields()[5].setForeGroundColor(Color.BLACK);
        gui.getFields()[5].setBackGroundColor(Color.BLUE);
        gui.getFields()[5].setDescription("Du landede på iskiosken");

        // felt 6
        gui.getFields()[6].setTitle("I fængsel");
        gui.getFields()[6].setSubText("Bare på besøg");
        gui.getFields()[6].setForeGroundColor(Color.BLACK);
        gui.getFields()[6].setBackGroundColor(Color.LIGHT_GRAY);
        gui.getFields()[6].setDescription("Du på besøg i fængslet");

        //felt 7
        gui.getFields()[7].setTitle("Museet");
        gui.getFields()[7].setSubText("M2");
        gui.getFields()[7].setForeGroundColor(Color.BLACK);
        gui.getFields()[7].setBackGroundColor(Color.RED);
        gui.getFields()[7].setDescription("Du landede på museet");

        //felt 8
        gui.getFields()[8].setTitle("Biblioteket");
        gui.getFields()[8].setSubText("M2");
        gui.getFields()[8].setForeGroundColor(Color.BLACK);
        gui.getFields()[8].setBackGroundColor(Color.RED);
        gui.getFields()[8].setDescription("Du landede på biblioteket");

        //felt 9
        gui.getFields()[9].setTitle("Prøv Lykken");
        gui.getFields()[9].setSubText("");
        gui.getFields()[9].setForeGroundColor(Color.BLACK);
        gui.getFields()[9].setBackGroundColor(Color.ORANGE);
        gui.getFields()[9].setDescription("Prøv lykken kort");

        //felt 10
        gui.getFields()[10].setTitle("Skaterparken");
        gui.getFields()[10].setSubText("M2");
        gui.getFields()[10].setForeGroundColor(Color.BLACK);
        gui.getFields()[10].setBackGroundColor(Color.YELLOW);
        gui.getFields()[10].setDescription("Du landede på skaterparken");

        //felt 11
        gui.getFields()[11].setTitle("Swimmingpoolen");
        gui.getFields()[11].setSubText("M2");
        gui.getFields()[11].setForeGroundColor(Color.BLACK);
        gui.getFields()[11].setBackGroundColor(Color.YELLOW);
        gui.getFields()[11].setDescription("Du landede på Swimmingpoolen");

        //felt 12
        gui.getFields()[12].setTitle("Gratis parkering");
        gui.getFields()[12].setSubText("");
        gui.getFields()[12].setForeGroundColor(Color.BLACK);
        gui.getFields()[12].setBackGroundColor(Color.LIGHT_GRAY);
        gui.getFields()[12].setDescription("Gratis parkering");

        //felt 13
        gui.getFields()[13].setTitle("Spillehallen");
        gui.getFields()[13].setSubText("M3");
        gui.getFields()[13].setForeGroundColor(Color.BLACK);
        gui.getFields()[13].setBackGroundColor(Color.PINK);
        gui.getFields()[13].setDescription("Du landede på spillehallen");

        //felt 14
        gui.getFields()[14].setTitle("Biografen");
        gui.getFields()[14].setSubText("M3");
        gui.getFields()[14].setForeGroundColor(Color.BLACK);
        gui.getFields()[14].setBackGroundColor(Color.PINK);
        gui.getFields()[14].setDescription("Du landede på biografen");

        //felt 15
        gui.getFields()[15].setTitle("Prøv Lykken");
        gui.getFields()[15].setSubText("");
        gui.getFields()[15].setForeGroundColor(Color.BLACK);
        gui.getFields()[15].setBackGroundColor(Color.ORANGE);
        gui.getFields()[15].setDescription("Prøv lykken kort");

        //felt 16
        gui.getFields()[16].setTitle("Legetøjsbutikken");
        gui.getFields()[16].setSubText("M3");
        gui.getFields()[16].setForeGroundColor(Color.BLACK);
        gui.getFields()[16].setBackGroundColor(Color.WHITE);
        gui.getFields()[16].setDescription("Du landede på legetøjsbutikken");

        //felt 17
        gui.getFields()[17].setTitle("Dyrehandlen");
        gui.getFields()[17].setSubText("M3");
        gui.getFields()[17].setForeGroundColor(Color.BLACK);
        gui.getFields()[17].setBackGroundColor(Color.WHITE);
        gui.getFields()[17].setDescription("Du landede på dyrehandlen");

        //felt 18
        gui.getFields()[18].setTitle("Gå i fængsel");
        gui.getFields()[18].setSubText("");
        gui.getFields()[18].setForeGroundColor(Color.BLACK);
        gui.getFields()[18].setBackGroundColor(Color.LIGHT_GRAY);
        gui.getFields()[18].setDescription("Ryk til fængslet");

        //felt 19
        gui.getFields()[19].setTitle("Bowlinghallen");
        gui.getFields()[19].setSubText("M4");
        gui.getFields()[19].setForeGroundColor(Color.BLACK);
        gui.getFields()[19].setBackGroundColor(Color.MAGENTA);
        gui.getFields()[19].setDescription("Du landede på bowlinghallen");

        //felt 20
        gui.getFields()[20].setTitle("Zoo");
        gui.getFields()[20].setSubText("M4");
        gui.getFields()[20].setForeGroundColor(Color.BLACK);
        gui.getFields()[20].setBackGroundColor(Color.MAGENTA);
        gui.getFields()[20].setDescription("Du landede på Zoo");

        //felt 21
        gui.getFields()[21].setTitle("Prøv Lykken");
        gui.getFields()[21].setSubText("");
        gui.getFields()[21].setForeGroundColor(Color.BLACK);
        gui.getFields()[21].setBackGroundColor(Color.ORANGE);
        gui.getFields()[21].setDescription("Prøv lykken kort");

        //felt 22
        gui.getFields()[22].setTitle("Vandlandet");
        gui.getFields()[22].setSubText("M5");
        gui.getFields()[22].setForeGroundColor(Color.BLACK);
        gui.getFields()[22].setBackGroundColor(Color.CYAN);
        gui.getFields()[22].setDescription("Du landede på vandlandet");

        //felt 23
        gui.getFields()[23].setTitle("Strandpromenaden");
        gui.getFields()[23].setSubText("M5");
        gui.getFields()[23].setForeGroundColor(Color.BLACK);
        gui.getFields()[23].setBackGroundColor(Color.CYAN);
        gui.getFields()[23].setDescription("Du landede på strandpromenaden");




//Opretter spiller og start balance på 2000
        //GUI_Player player = new GUI_Player("Junior", 2000)
        GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.CHECKERED);
        GUI_Car car2 = new GUI_Car(Color.RED, Color.WHITE, GUI_Car.Type.RACECAR, GUI_Car.Pattern.CHECKERED);
        GUI_Car car3 = new GUI_Car(Color.GREEN, Color.ORANGE, GUI_Car.Type.UFO, GUI_Car.Pattern.CHECKERED);
        GUI_Player Junior = new GUI_Player("Junior", 2000, car1);
        GUI_Player Matador = new GUI_Player("Matador", 2000, car2);
        GUI_Player Jasmin = new GUI_Player("Jasmin", 2000, car3);
        // Tilføjer ham til spillet
        gui.addPlayer(Junior);
        gui.addPlayer(Matador);
        gui.addPlayer(Jasmin);

        // Henter feltet
        GUI_Field field = gui.getFields()[0];

// Sæt bilen til at blive vist
        field.setCar(Junior, true);

        field.setCar(Matador, true);

        field.setCar(Jasmin, true);
        Terning terning = new Terning();

        while (true) {
            // Tag i mod input fra brugeren
            String choice = gui.getUserButtonPressed("Slå med terningen", "Slå med terningen", "Prøv lykken kort");
            if (choice.equals("Slå med terningen"))
                gui.setDie(terning.RollTheDice()); // Vis en terning
            if(choice.equals("Prøv lykken kort"));
            gui.displayChanceCard();

            gui.setChanceCard("Modtag penge");
            gui.setChanceCard("Betal penge");

        }
}}




