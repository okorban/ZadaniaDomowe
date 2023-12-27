package BMIcal.kalkulator;

public class Kalkulator {

    public double CountBMI(double weight, double height){
        double BMI =  weight / (height * height);
        System.out.println("Twoje BMI to: " + BMI);
        if( BMI < 18.5){
            System.out.println("Niedowaga");
        } else if( BMI < 25.0){
            System.out.println("Prawidłowa waga");
        } else {
            System.out.println(" Nadwaga");
        }
        return BMI;
    }
}
