package Esercizi_Esami;

/** Questa classe rappresenta una persona mediante l'attributo nome
 *  La classe è una superclasse di Studente */
public class Persona {
    private String nome;

    public Persona() {
        this("Ancora nessun nome");
    }

    public Persona(String nomeIniziale) {
        this.nome = nomeIniziale;
    }

    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public String getNome() {
        return nome;
    }

    public void scriviOutput() {
        System.out.println("Nome: " + nome);
    }

    public boolean haLoStessoNome(Persona altraPersona){
        return this.nome.equalsIgnoreCase(altraPersona.nome);
    }
}
