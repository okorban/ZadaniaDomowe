public class Zad3 {
    public static void main(String[] args) {
    /*    Program zawiera zmienną n. Napisz program,
    który sprawdzi jaką potęgą liczby 2 jest liczba n.
    Program powinien wyświetlać potęgę lub
    komunikat jeśli liczba n nie jest potęgą liczby 2. Przykład:
        n = 4
        2
        n = 16
        4
        n = 128
        7
        n = 199
        to nie jest potęga dwójki*/

        int n = 10;
        boolean run = true;
        int potega = 0;
        while( run && n != 1){
            if( n % 2 != 0){
                System.out.println("To nie jest potęga 2!");
                run = false;
            } else{
                potega += 1;
            }
            n = n / 2;
        }
        if(potega != 0) {
            System.out.println("jest to: " + potega + " potega dwojki");
        }



    }

//    public static int potega2(int n){
//        if(n % 2 != 0){
//            return 0;
//        } else return 1 + potega2(n/2);


    }



