package Esercizi_Esami;

public class CalcolaPrezzo {
    public static void main(String[] args){
        double[] prezzi = {2.10,4.20,6.30};

        int[] countProdotti = {1,2,0};

        double prezzo = calcolaPrezzo(prezzi,countProdotti);
        System.out.println("Prodotto Scalare: " + prezzo);
    }

    public static double calcolaPrezzo(double[] p, int[] c){
        double finalPrice = 0;
        for (int i = 0; i < p.length; i++) {
             finalPrice = p[i] * c[i] + finalPrice;
        }

        return finalPrice;
    }
}
