package Esercizi_Esami;

public class Array {
    protected char[] a;

    public Array() {
        this(new char[]{}); // Invoco il costruttore Array(char[] a)
    }

    public Array(char[] a){
        this.a = a;
    }

    public char get(int i){
        return a[i];
    }

    public void set(char x, int i){
        a[i] = x;
    }

    public String toString(){
        String r = "{";
        for (int i = 0; i < a.length; i++){
            r += a[i];
            if(i < a.length -1)
                r += ", ";
        }

        r += "}";
        return r;
    }

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};

        Array x = new Array();
        System.out.println(x);
        Array y = new Array(a);
        System.out.println(y);
        y.set('q', 1);
        System.out.println(y);
       // y.set('w', 5);

    }
}
