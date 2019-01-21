package Esercizi_Esami;

public class UtilitaMessaggi {
    public static void main(String[] args) {
        Messaggio m = new Messaggio("Amazon", "Daniele Di Salvo", "Re: Il tuo ordine è stato spedito");

        Messaggio p = new Messaggio("Daniele", "Amazon", "Re: Grazie ho ricevuto il vostro ordine");
       // m.isRisposta(m.getOggetto());
       // p.isRisposta(p.getOggetto());
        m.isRisposta(p.getOggetto());







    }
}
