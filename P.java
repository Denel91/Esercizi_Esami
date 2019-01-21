package Esercizi_Esami;

public class P {
    public static void main(String[] args) {
        char[] a = {'q', 'w', 'e', 'r'};
        int[] b = {1, 3, 0, 1};
        char[] r = m(b, a);

        for (int i = 0; i < r.length; i++)
            System.out.print(r[i] + " ");
    }

    public static char[] m(int[] x, char[] y) {
        char[] res = new char[x.length];
        for (int i = 0; i < x.length; i++) {
            res[i] = y[x[i]];

        }
        return res;
    }
}

