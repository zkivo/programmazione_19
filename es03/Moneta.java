package es03;

public class Moneta {
    
    public int lancia() {
         /* Ritorna:
         * 0: testa
         * 1: croce */
        if (Math.random() < 0.5) return 0;
        else return 1;
    }

}