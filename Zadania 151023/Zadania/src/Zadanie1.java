public class Zadanie1 {
    public static void main(String[] args) {

        int[] tab = new int[20];

        int j = 2;
        for( int i = 0; i < 20; i++){
            tab[i] = j;
            j += 2;
        }

        // inna wersja
        for(int i = 0, value = 2; i < 20; i++, value = value + 2){
            tab[i] = value;
        }

        // wersja bez drugiej zmiennej
        for(int i = 0; i < 20; i++){
            tab[i] = i * 2 + 2;
            System.out.println(tab[i]);
        }


        for ( int element : tab){
            System.out.println(element);
        }

    }
}
