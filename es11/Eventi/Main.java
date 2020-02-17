package es11.Eventi;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void inserireTastiera(Scanner scanner, Queue<Evento> coda) {
        String desc;
        int    codice;        
        int    cod_tasto;
        int    sta_mod;
        
        System.out.print("Inserisci descrizione :");
        desc = scanner.nextLine();
        do {
            try {
                System.out.print("Inserisci codice :");
                codice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);

        do {
            try {
                System.out.print("Inserisci codice tasto :");
                cod_tasto = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);

        do {
            try {
                System.out.print("Inserisci stato modificatori :");
                sta_mod = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);
        coda.offer(new EventoTastiera(codice, desc, cod_tasto, sta_mod));
    }

    public static void inserireMouse(Scanner scanner, Queue<Evento> coda) {
        String desc;
        int    codice;        
        int    x;
        int    y;
        int    stato;
        
        System.out.print("Inserisci descrizione :");
        desc = scanner.nextLine();
        do {
            try {
                System.out.print("Inserisci codice :");
                codice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);
        do {
            try {
                System.out.print("Inserisci x :");
                x = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);
        do {
            try {
                System.out.print("Inserisci y :");
                y = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);
        do {
            try {
                System.out.print("Inserisci stato pressione tasti :");
                stato = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
            }
        } while(true);
        coda.offer(new EventoMouse(codice, desc, x, y, stato));
    }

    public static void prelevaEvento(Scanner scanner, Queue<Evento> coda) {
        if (coda.peek() == null) {
            System.out.println("-- Coda vuota --");
            return;
        }
        System.out.println(coda.poll());
    }

    public static void main(String args[]) {
        
        Queue<Evento> coda    = new LinkedList<>();
        Scanner       scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("\n-- Menu' --\n" +
                             "1) Inserire evento tastiera\n" +
                             "2) Inserire evento mouse\n" +
                             "3) Prelevare evento\n" +
                             "4) Exit\n>>");
            
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
                continue;
            } 

            if (input == 1) {
                inserireTastiera(scanner, coda);
            } else if (input == 2) {
                inserireMouse(scanner, coda);
            } else if (input == 3) {
                prelevaEvento(scanner, coda);
            } else if (input == 4) {
                break;
            } else {
                System.out.println("-- Input non valido --");
                continue;
            }
    
        } while(true);
    }

}
