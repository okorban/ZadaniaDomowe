package it.camp.dziedziczenie;

import it.camp.dziedziczenie.gui.GUI;
import it.camp.dziedziczenie.model.Figura;


public class Testy {
    public static void main(String[] args) {

        if(Figura.CheckIfCanCreateANFigure(GUI.stringTabToIntTab(GUI.inPut()))){
            //   Figura figura = new Figura(tablicaFigury);
        }
        else{
            System.out.println("Z podanych liczb nie da się utworzyć figury! ");
        }


    }
}
