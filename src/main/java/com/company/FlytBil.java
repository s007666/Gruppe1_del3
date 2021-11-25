package com.company;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.lang.reflect.Field;

public class FlytBil {

    private GUI_Field field;
    private GUI gui;

    public FlytBil(GUI gui, GUI_Field field) {
        this.gui = gui;
        this.field = field;
    }

    public void flyt(GUI_Player spiller){
        field.setCar(spiller, true);
    }



}



  /*  private static GUI move_instance = null;
    public static GUI instance() {
        if (move_instance == null) {
            move_instance = new GUI();
        }
        return move_instance;
    }
// Sætter spillerens bil på start
     
// Forkert: Nu vises spillerns bil på begge felter!

// Sådan, nu er bilen fjernet fra felt

    }*/
