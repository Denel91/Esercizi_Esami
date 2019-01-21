package Esercizi_Esami;

public class Pitagora {
    public static void main(String[] args){
        int[] righe = {1,2,0};

        int[] colonne = {2,4,6,7};

        visualizza(pitagora(righe,colonne));
    }

    public static int[][] pitagora(int[] a, int[] b) {
        int[][] tavola = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                tavola[i][j] = a[i] * b[j];
            }
        }

        return tavola;
    }

    public static void visualizza(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }
}
