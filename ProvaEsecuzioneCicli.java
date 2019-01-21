package Esercizi_Esami;

public class ProvaEsecuzioneCicli {
    public static void main(String[] args) {

    System.out.println(mah(4));

    }

    public static int mah(int x) {
        int k,j;
        int y = 2;
        for(k = 0; k < 3; k++){
            for(j = 0; j < k; j++){
                if(y < 5){
                    y = y + x;
                } else {
                    y = y - k;
                }

                if(k == 3) break;
            }
        }

        return y + k;
    }
}
