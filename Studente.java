package Esercizi_Esami;
/** Questa classe rappresenta uno studente tramite gli attributi nome e matricola
 *  La classe Studente estende la classe Persona, rappresenta cioè una specificazione
 *  delle possibili istanze di Persona */
public class Studente extends Persona {
    private int matricola;

    public Studente() {
        super();
        this.matricola = 0;
    }

    public Studente(String nomeIniziale, int matricolaIniziale) {
        super(nomeIniziale);
        this.matricola = matricolaIniziale;
    }

    public void reimposta(String nuovoNome, int nuovaMatricola) {
        setNome(nuovoNome);
        this.matricola = nuovaMatricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int nuovaMatricola) {
        this.matricola = nuovaMatricola;
    }

    public void scriviOutput() {
        super.scriviOutput(); // Visualizza il nome e invoca il metodo della classe base
        System.out.println("Matricola: " + matricola);
    }

    public boolean equals(Studente altroStudente){
        return this.haLoStessoNome(altroStudente) && (this.matricola == altroStudente.matricola);
    }
}
