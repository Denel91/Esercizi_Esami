package Esercizi_Esami;

public class ArrayEstendibile {
    public static void main(String[] args){
        char[] caratteri = {'a', 'b', 'c'};
        char[] d = estendi(caratteri, 1);
        System.out.println(d);

    }

    public static char[] estendi(char[] c, int n){
        char[] v = new char[c.length + n];
        for (int i = 0; i < c.length; i++){
            v[i] = c[i];
        }

        for (int i = c.length; i < v.length; i++){
            v[i] = 'd';
        }

        return v;

    }
}
