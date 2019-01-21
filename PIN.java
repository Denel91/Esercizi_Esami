package Esercizi_Esami;

class PIN {
  private int pin;

  public void cambiaPIN(int pin) {
    this.pin = pin;
}

  public int mostraPIN() {
    return pin;
  }

  public String toString() {
    return "" + pin;
  }

  public static void main(String[] args) {
    PIN p = new PIN();
  //PIN p = new PINSegreto();
    p.cambiaPIN(123);
    System.out.println(p.mostraPIN());
    System.out.println(p);

   /* p.cambiaPIN(456);
    System.out.println(p.mostraPIN());
    System.out.println(p);
    */
  }
}
