package Esercizi_Esami;


public class NumeriPrimi {
    public static void main(String[] args) {

        int[] array = {1, 4, 2, 6, 3, 8, 5, 12, 11, 14};

        tuttiPrimi(array);
    }

    public static boolean primo(int numero) {
        if (numero < 2) {

            return false;

        } else if (numero == 2) {

            return true;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }

        return true;
    }

    //Controlla se tutte le posizioni di indice pari contengono numeri primi
    public static void tuttiPrimi(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {

                System.out.println("Il numero " + a[i] + " " + primo(a[i]));
            }
        }
    }

    public static void stampa(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
