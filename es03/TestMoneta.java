package es03;

public class TestMoneta {

    public static void main(String args[]) {
        Moneta moneta = new Moneta();
        int count = 0, temp;
        for (int i = 0; i < 50; i++) {
            System.out.print(temp = moneta.lancia());
            if (temp == 1) count++;
        }
        System.out.println("\nCroce e' uscito " + count + " volte.");
    }

}