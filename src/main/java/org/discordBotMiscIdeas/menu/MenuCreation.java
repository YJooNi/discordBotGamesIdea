package org.discordBotMiscIdeas.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuCreation {

    public void menu(List<String> list){
        int n = 1;
        for(String option : list) {
            System.out.println(n + ". " + option);
            n++;
        }
    }

}
