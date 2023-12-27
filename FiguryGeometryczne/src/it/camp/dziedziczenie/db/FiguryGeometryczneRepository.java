package it.camp.dziedziczenie.db;

import it.camp.dziedziczenie.model.Figura;

import java.util.ArrayList;

public class FiguryGeometryczneRepository {

    private static ArrayList<Figura> listaFigur = new ArrayList<>();

    public static void addToRepository(Figura figura){
        listaFigur.add(figura);
    }

    public static void printAll(){
        for(Figura figura : listaFigur){
            System.out.println(figura.toString());
        }
    }
}
