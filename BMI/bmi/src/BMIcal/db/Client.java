package BMIcal.db;

import java.util.Random;

public class Client {

    // stowrzenie i zapomiętanie ID
    Random losowanie = new Random();
    double[] tab = new double[10];

    public String CreateAndSafeID(double BMI){
        int ID = losowanie.nextInt(0,10);
        this.tab[ID] = BMI;
        return "Twoje id to: " + ID;
    }

    public String RemindBMI(int ID){
        if(this.tab[ID] == 0) {
            return "Niepoprawne ID.";
        } else return "Twoje BMI to " + tab[ID];
    }

}
