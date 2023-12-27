public class Zadanie6 {
    public static void main(String[] args) {

    // chcemy miec tablice dwuwymiarowa - tworzymy macierz 10 X 10
    //

        int[][] tab = new int[10][10];

        for( int i = 0; i < 10; i++ ){
            for (int j = 0; j < 10; j++){
                tab[i][j] = (i + 1)* (j + 1);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] element1 : tab ){
            for (int element2 : element1 ){
                System.out.print(element2 + " ");
            }
            System.out.println();
        }

    }
}
