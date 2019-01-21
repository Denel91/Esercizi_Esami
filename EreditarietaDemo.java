package Esercizi_Esami;

public class EreditarietaDemo {
    public static void main(String[] args) {

        Studente p = new Studente("Antonio", 76338);
        Persona m = new Studente("Je", 32409 );
        NonLaureato v = new NonLaureato("Fanny", 145763, 3);
        Persona myPerson = new Studente("Fra", 236549);
        Studente s = new NonLaureato("Marco", 123456, 2);

        System.out.println("Dati dello studente s: ");
        s.scriviOutput();

        System.out.println("Dati dello studente p: ");
        p.scriviOutput();

        System.out.println("Dati dello studente m: ");
        m.scriviOutput();
        System.out.println(m instanceof Studente);

        System.out.println("Dati dello studente v: ");
        v.scriviOutput();

        System.out.println("Dati dello studente myPerson: ");
        System.out.println(((Studente)myPerson).getMatricola());

    }
}
