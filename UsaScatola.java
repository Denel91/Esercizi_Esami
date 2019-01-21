package Esercizi_Esami;

public class UsaScatola {
    public static void main(String[] args) {
        Scatola s1 = new Scatola(2, 17, '@');
        Scatola s2 = new Scatola(6,6,'@');

        s2.allarga();
        s2.allarga();
        s2.allarga();
        s2.allarga();
        s2.allarga();

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s1.cambiaCarattere('+');
        s1.ruota();
        System.out.println(s1.toString());

        s2.allunga();
        s2.allunga();
        s2.ruota();
        System.out.println(s2.toString());
    }
}
