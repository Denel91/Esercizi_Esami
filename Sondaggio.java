package Esercizi_Esami;

public class Sondaggio {
    private String[] risposte;
    private int[] voti;
    private String domanda;

    public Sondaggio(String domanda, String[] risposte) {
        this.risposte = new String[risposte.length];
        this.voti = new int[risposte.length];

        for (int i = 0; i < risposte.length; i++) {
            this.risposte[i] = risposte[i];
            voti[i] = 0;
        }

        this.domanda = domanda;
    }

    public Sondaggio vota(String risposta) {
        int i;
        for(i = 0; i < risposte.length; i++)
            if(risposte[i].equals(risposta)){
                voti[i]++;
                break;
            }
        return this;
    }

    public String toString(){
        String s = "";
        for (int i = 0; i <risposte.length; i++){
            s = s + risposte[i] + " ";
        }

        return domanda + "\n" + s;
    }
}
