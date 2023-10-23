public class Zad11 {
    public static void main(String[] args) {
        //Napisz program który ma dwie zmienne:
        //weight - waga, liczba całkowita
        //height - wzrost, liczba całkowita
        //program ma obliczać BMI (wskaźnik masy ciała, wzór do znalezienia w internecie, gdybyście nie znaleźli to piszcie)
        // i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.

        int weight = 56;
        int height = 173;
        double wzrost = height/100.0;
        double BMI = weight / (wzrost * wzrost);

        if ( BMI < 18.5 ){
            System.out.println("Niedowaga");
        } else if(BMI < 25){
            System.out.println("Waga w normie");
        } else{
            System.out.println("Nadwaga");
        }

    }
}
