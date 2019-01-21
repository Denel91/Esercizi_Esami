package Esercizi_Esami;

public class ProvaEccezioni {
    public static void main(String[] args) throws Exception {
             System.out.println(0);

        try {

            System.out.println(1);
            throw new Exception();

        } catch (Exception e){

            System.out.println(3);
            throw new Exception();
        }

            //System.out.println(4);
    }
}
