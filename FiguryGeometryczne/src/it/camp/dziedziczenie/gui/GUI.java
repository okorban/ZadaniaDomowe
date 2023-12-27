package it.camp.dziedziczenie.gui;

import it.camp.dziedziczenie.model.Figura;

import java.util.Scanner;

public class GUI {
    static Scanner scanner = new Scanner(System.in);

    //wczytujemy dane
    public static String inPut(){
        String input = scanner.nextLine();
        String[] liczbyStr = input.split(" "); //wsadzamy liczny jako litery do tablicy

        if(liczbyStr.length < 3 || liczbyStr.length > 6){
            System.out.println("Niewłaściwa długość");
        }
        return input;
    }

    public static int[] stringTabToIntTab(String input){
        String[] liczbyStr = input.split(" "); //wsadzamy liczny jako litery do tablicy
        int[] tab = new int[liczbyStr.length];
        for(int i = 0; i < liczbyStr.length; i++){
            tab[i] = Integer.parseInt(liczbyStr[i]);
        }
        return tab;
    }

    public static void GetInput() {
        int numberOfInquiery = 0;
        System.out.println("Wpisz pięć zestawów liczb oddzielonych spacją");
        while(numberOfInquiery < 5){
             int[] tablicaLiczb = GUI.stringTabToIntTab(GUI.inPut());

            if(Figura.CheckIfCanCreateANFigure(tablicaLiczb)){
                Figura figura = new Figura(tablicaLiczb);

            }
            else{
                System.out.println("Z podanych liczb nie da się utworzyć figury! ");
            }

            numberOfInquiery++;
        }
    }




}
