package Esercizi_Esami;

public class Scatola {
    private int altezza;
    private int larghezza;
    private char carattere;

    public Scatola(int h, int l, char c) {
        this.altezza = h;
        this.larghezza = l;
        this.carattere = c;
    }

    public Scatola(int l) {
        this(1,1,'*');
    }

    public void allunga(){
        altezza = altezza + 2;
    }

    public void allarga(){
        larghezza = larghezza + 2;
    }

    public void ruota(){
        int temp = altezza;
        altezza = larghezza;
        larghezza = temp;
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < altezza; i++){
            for(int j = 0; j < larghezza; j++) {
                s = s + carattere + " ";
            }

            s += "\n";
        }

        return s;
    }

    public void cambiaCarattere(char nuovoCarattere) {
        this.carattere = nuovoCarattere;
    }
}
