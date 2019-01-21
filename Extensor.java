package Esercizi_Esami;

public class Extensor {
  public static void main(String[] args) {
    char[] a = {'a','b','c','d'};
    char[] b = run(a, 3);
    System.out.println(b);
  }

  public static char[] run(char[] a, int n) {
    char[] v = new char[a.length + n];

    for(int i = 0; i < a.length; i++) {
      v[i] = a[i];
    }

  for(int i = a.length; i < v.length; i++) {
    v[i] = '_';

    }
    return v;
  }
}
