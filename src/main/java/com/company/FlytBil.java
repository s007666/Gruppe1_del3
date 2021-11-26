package com.company;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


public class FlytBil {

    private final GUI_Field field;
    private final GUI gui;

    public FlytBil(GUI gui, GUI_Field field) {
        this.gui = gui;
        this.field = field;
    }

    public void flyt(GUI_Player spiller){
        field.setCar(spiller, true);
    }
}
