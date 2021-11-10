package com.company;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
//Matadorspilleplade fra Maven - Starter GUI herfra Main.

public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();

        // Opretter spiller med navnet Junior og start balance på 2000
        //GUI_Player player = new GUI_Player("Junior", 2000)
        GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.CHECKERED);
        GUI_Car car2 = new GUI_Car(Color.RED, Color.WHITE, GUI_Car.Type.RACECAR, GUI_Car.Pattern.CHECKERED);
        GUI_Player Junior = new GUI_Player("Junior", 2000, car1);
        GUI_Player Matador = new GUI_Player("Matador",2000, car2);

        // Tilføjer ham til spillet
        gui.addPlayer(Junior);
        gui.addPlayer(Matador);


    }

}
