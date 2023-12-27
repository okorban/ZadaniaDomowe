public class Zadanie5 {
    public static void main(String[] args) {
     // chcemy tablice liczb po koleii 1,2,3,.., 100
     // jesli liczba jest podzielna przez 3 to wpisuje Fizz
     // jeśli liczba jest podzielna jest przez 5 to wypisuje się Buzz
     // jeśli przez to i przez to wypisujemy Fizz i Buzz

     int[] tab = new int[100];

     for(int i = 0; i < 100; i++ ){
         tab[i] = i + 1;

         System.out.print(tab[i]);

         if( tab[i] % 3 == 0){
             System.out.print(" Fizz");
         }
         if( tab[i] % 5 == 0){
             System.out.print(" Buzz");
         }
           System.out.println();

     }
    }
}
