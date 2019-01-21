package Esercizi_Esami;

public class MatriceSposta {
    public static void main(String[] args) {

        int[][] matrice = {{1, 2, 3, 4, 5},
                           {6, 7, 8, 9, 0},
                           {1, 2, 3, 4, 5},
                           {6, 7, 8, 9, 0},
                           {1, 2, 3, 4, 5}};

        sposta(matrice);
        visualizza(matrice);

    }

    public static void visualizza(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void azzeraColonna(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 0;
        }
    }

    public static void sposta(int[][] m) {
        int temp;
        for (int i = 0; i < m.length - 1; i++) {
            temp = m[i][i];
            m[i][i] = m[i + 1][i + 1];
            m[i + 1][i + 1] = temp;
        }
    }
}




