public class Zad10 {
    public static void main(String[] args) {
// Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
// Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
// Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false)
// i obliczyć obwód tego trójkąta. Jak sprawdzić czy z podanych boków
// da się zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".


        int a = 7;
        int b = 8;
        int c = 15;

        if( a + b > c && b + c > a && a + c > b){
            int obwod = a + b + c;
            System.out.println("Obwód trójkąta to: " + obwod);
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
