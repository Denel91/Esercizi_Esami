package Esercizi_Esami;

import java.lang.String;

public class Messaggio {
    private String mittente;
    private String destinatario;
    private String oggetto;
    private String testo;

    public Messaggio(String mittente, String destinatario, String oggetto) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.oggetto = oggetto;
        this.testo = "";
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public void isRisposta(String oggetto) {
        if (oggetto.startsWith("Re") && oggetto.endsWith("spedito")) {
            log("Messaggio corrente!");
        } else {
            log("Il messaggio è una risposta!");
        }
    }
}
