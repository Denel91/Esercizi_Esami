package Esercizi_Esami;
public class Viaggiare {
    public static void main(String[] args) {
        Veicolo v = new Moto();
        Moto b = new Moto();
        Veicolo s = new Sidecar();
        Auto a = new Auto("Ford Fiesta", "Daniele Di Salvo");
        System.out.println(v.passeggeri()); // 2
        System.out.println(b.passeggeri()); // 2
        System.out.println(s.passeggeri()); // 3
        System.out.println(a.toString());
    }
}

interface Veicolo {
    public abstract int passeggeri();
}

class Moto implements Veicolo {
    public int passeggeri() {
        return 2;
    }
}

class Sidecar extends Moto {
    public int passeggeri() {
        return 3;
    }
}

class Auto implements Veicolo {
    private String modello;
    private String proprietario;

    public Auto(String modello, String proprietario){
        this.modello = modello;
        this.proprietario = proprietario;
    }

    public int passeggeri() {
        return 5;
    }

    public String getModello() {
        return modello;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String toString() {
        return "Modello: " + modello + "\nProprietario: " + proprietario;
    }
}