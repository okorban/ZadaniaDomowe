public class Zadanie2 {
    public static void main(String[] args) {

        int[] tab = new int[1000];
// tu sobie deklarujemy tablice z 1000 elementami
        for( int i = 0; i <1000; i++ ){
            tab[i] = i + 1;
        }

// wyswietlamy tylko te podzielne przez 2 i przez 3

    for( int element : tab ){
        if ((element % 2 == 0 ) && ( element % 3 == 0))
          System.out.println(element);
    }
    }
}
