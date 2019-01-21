package Esercizi_Esami;
public class Biscottiera {
    private int capacita;
    private int biscotti;

    public Biscottiera(int capacita) {
         this.capacita = capacita;
         biscotti = 0;
    }

    public boolean piena() {
            return (capacita <= biscotti);
    }

    public boolean vuota() {
       return (capacita == 0);
    }

    public void aggiungiBiscotto() throws Exception {
        if(capacita != 0) {
            biscotti = biscotti + 1;
            capacita = capacita - 1;
        } else {
            throw new Exception("Riempita!");
        }
    }

    public void togliBiscotto() throws Exception {
        if(!vuota()) {
            biscotti = biscotti - 1;
            capacita = capacita + 1;
        } else {
            throw new Exception("Vuota!");
        }
    }

    public int getCapacita() {
        return capacita;
    }

    public static void main(String[] args) throws Exception {
        Biscottiera cookie = new Biscottiera(2);

        try {
            cookie.aggiungiBiscotto();
            cookie.aggiungiBiscotto();
            cookie.aggiungiBiscotto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                cookie.togliBiscotto();
            } catch (Exception e1) {
                System.out.println("Capacità disponibile: " + cookie.getCapacita());
            }

        }
    }
}
