package Esercizi_Esami;

public class ReverseDiagonal {
    public static void main(String[] args) {

        int[][] matrice = {{1,2,3,7},
                           {4,5,6,8},
                           {7,2,9,3},
                           {5,8,6,4}};

        int[][] matrix = {{1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5}};

        //reverseDiagonal(matrice);
        //visualizza(matrice);

        //reverseDiagonal(matrix);
        //visualizza(matrix);

        sposta(matrix);
        visualizza(matrix);

    }

    public static void visualizza(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseDiagonal(int[][] m){
        for (int i = 0; i < m.length / 2; i++) {
            int temp = m[i][i];
            m[i][i] = m[m.length-1-i][m.length-1-i];
            m[m.length-1-i][m.length-1-i] = temp;
        }
    }

    public static void sposta(int[][] m){
        for (int i = 0; i < m.length - 1; i++) {
            int temp = m[i][i];
            m[i][i] = m[(m.length - 1) / 2 - 1 + i][(m.length - 1) / 2 - 1 + i];
            m[(m.length - 1) / 2 - 1 + i][(m.length - 1) / 2 - 1 + i] = temp;
        }
    }
}
