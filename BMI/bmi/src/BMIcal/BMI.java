package BMIcal;

import BMIcal.db.Client;
import BMIcal.gui.GUI;

public class BMI {

    //Napisz aplikację kalkulator BMI. Po uruchomieniu aplikacji widzimy menu:
    //	1. Oblicz BMI.
    //	2. Przypomnij BMI.
    //	3. Exit.
    //Po wybraniu 1 użytkownik wpisuje potrzebne dane.
    // Aplikacja oblicza jego wskaźnik BMI (wzór znajdziecie w Internecie),
    // podaje informację czy występuje otyłość, niedowaga, nadwaga itd.
    // Wraz z wynikiem użytkownik ma dostać również ID swojego BMI.
    //Po wybraniu 2 użytkownik wpisuje ID i aplikacja podaje mu wcześniej obliczone BMI.
    //W skrócie należy wymyślić jakiś sposób
    // na generowanie unikalnych ID, może to być np.
    // losowanie. Każde obliczenie jest zapamiętywane w
    // tablicy (baza danych) i jak użytkownik chce sobie
    // przypomnieć wyliczenie które już zrobił to podaje tylko ID
    // i aplikacja wyświetla jakie parametry (waga, wzrost itd.)
    // był wpisane i jaki był wynik. Aplikacja podobna do wypożyczalni samochodów -
    // używamy obiektowości i wszystkiego co ostatnio się uczyliśmy.

    public static void main(String[] args) {

        GUI gui = new GUI();
        Client klient = new Client();
        boolean run = true;

        while(run ){

            switch ( gui.MenuAndChoice()){
                case 1:
                    System.out.println(klient.CreateAndSafeID(gui.GetDataAndReturnBmi()));
                    break;
                case 2:
                    // przypominamy BMI
                    System.out.println(klient.RemindBMI(gui.WczytajID()));
                    break;
                case 3:
                    System.out.println("Koniec programu!");
                    run = false;
                    break;

            }
        }
    }



}
