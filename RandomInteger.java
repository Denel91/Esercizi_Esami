package Esercizi_Esami;
import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        log("Generating 5 random integers in range 0..10");
        Random randomGenerator = new Random();
        for(int i = 0; i < 5; i++){
            int random = randomGenerator.nextInt(10);
            log("Generated: " + random);
        }

        log("Done!");
    }

    public static void log(String message){
        System.out.println(message);
    }
}
