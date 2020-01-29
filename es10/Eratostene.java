package es10;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Eratostene {

    public static void main(String args[]) {
        Scanner scanner  = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int numero;
        int i;
        int j;
        System.out.print("Inserire numero: ");
        numero = scanner.nextInt();
        //inserire numeri nel set
        for (i = 2; i <= numero; i++) {
            set.add(i);
        }
        for (i = 2; i <= (int)(Math.sqrt(numero)); i++) {
            if (!set.contains(i)) continue;            
            for (j = i + i; j <= numero; j+=i) {
                set.remove(j);
            }
        }
        System.out.println(set);
        scanner.close();
    }

}
