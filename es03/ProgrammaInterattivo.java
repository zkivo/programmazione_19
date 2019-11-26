package es03;

import java.util.Scanner;

public class ProgrammaInterattivo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.print("Digita qualcosa, oppure \"fine\" per terminare\n>>");
        while (!(str = scanner.next()).equals("fine"))
            System.out.print("Hai digitato " + str.toUpperCase() + ".\n>>");
        System.out.println("Fine del programma.");
    }

}