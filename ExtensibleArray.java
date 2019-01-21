package Esercizi_Esami;

public class ExtensibleArray extends Array {
public ExtensibleArray() {super();}
public ExtensibleArray(char[] a) {super(a);}

  public char get(int i) {
    return a[i];
  }

  public void set(char x, int i) {
    if(i >= a.length) {
      a = Extensor.run(a, i - a.length + 1);
  }
    a[i] = x;
  }


public static void main(String[] args) {
  char[] a = {'a','b','c'};

  //ExtensibleArray x = new ExtensibleArray();
  //System.out.println(x);
  ExtensibleArray y = new ExtensibleArray(a);
  System.out.println(y);
  y.set('q',1);
  System.out.println(y);
  y.set('w',5);
  System.out.println(y);

  }
}
