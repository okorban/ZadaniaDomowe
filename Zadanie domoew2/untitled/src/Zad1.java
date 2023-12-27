import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        //.Napisz program w którym zdefiniowana jest zmienna n.
        // Program ma wyświetlać n elementów ciągu Fibonacciego.
        // Co to jest ciąg Fibonacciego znajdziecie na wikipedii. Przykład:
        //n = 3
        //0 1 1
        //n = 8
        //0 1 1 2 3 5 8 13

        int n = 10;
        for( int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n){
        if(n == 0){
            return 0;
        } else if( n == 1){
            return 1 ;
        } else return fib(n-1) + fib(n-2);

    }

}
