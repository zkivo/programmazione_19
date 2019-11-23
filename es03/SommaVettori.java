package es03;

public class SommaVettori{

    public static void main(String args[]) {
        double v1[] = {(int) (Math.random() * 100),
                       (int) (Math.random() * 100),
                       (int) (Math.random() * 100)};
        double v2[] = {(int) (Math.random() * 100),
                       (int) (Math.random() * 100),
                       (int) (Math.random() * 100)};
        double somma[] = {v1[0] + v2[0],
                          v1[1] + v2[1],
                          v1[2] + v2[2]};

        System.out.println("V1: (" + v1[0] + ", " + v1[1] + ", " + v1[2] + ")");
        System.out.println("V2: (" + v2[0] + ", " + v2[1] + ", " + v2[2] + ")");
        System.out.println("Somma: (" + somma[0] + ", " + somma[1] + ", " + somma[2] + ")");
    }

}