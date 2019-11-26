package es03;

import java.util.Scanner;

public class ProgrammaInterattivo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str;
        String parole_vietate[] = {"alfa", "beta", "gamma", "delta", "epsilon",                            "kappa", "lambda", "sigma", "omega"};
        int i;
        System.out.print("Digita qualcosa, oppure \"fine\" per terminare\n>>");
        while (!(str = scanner.next()).equals("fine")) {
            for (i = 0; i < parole_vietate.length; i++) {
                if (str.equals(parole_vietate[i])) {
                    System.out.print("-- Hai Inserito una parola vietata --" + "\n>>");
                    break;
                }
            }
            if (i == parole_vietate.length) {
                // non e' stata inserita parola vietata
                System.out.print("Hai digitato " + str.toUpperCase() + ".\n>>");      
            }
        }
        System.out.println("Fine del programma.");
    }

}