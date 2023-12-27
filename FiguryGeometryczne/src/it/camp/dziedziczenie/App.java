package it.camp.dziedziczenie;

import it.camp.dziedziczenie.db.FiguryGeometryczneRepository;
import it.camp.dziedziczenie.gui.GUI;
import it.camp.dziedziczenie.model.Figura;

public class App {
    public static void main(String[] args) {
        GUI.GetInput();
        FiguryGeometryczneRepository.printAll();
    }
}
