package es11.Tennis;

import java.util.Scanner;

public class Incontro {

    private Giocatore giocatore_1;
    private Giocatore giocatore_2;
    private Set       set_1;
    private Set       set_2;
    private Set       set_3;
    
    private Scanner   scanner;

    public Incontro() {
        scanner = new Scanner(System.in);
        set_1   = new Set();
        set_2   = new Set();
        set_3   = new Set();
        setGiocatore1();
        setGiocatore2();    
    }

    public void simulazione() {
        int p_1 = 0; //Punti giocatori
        int p_2 = 0;
        int winner;        

        System.out.print("Simulazione set 1: ");
        winner = set_1.simulazione();
        if (winner == 0) {
            p_1++;
            System.out.println("vince " + giocatore_1.getNome() + 
                               " " + giocatore_1.getCognome());
        } else if (winner == 1) {
            p_2++;
            System.out.println("vince " + giocatore_2.getNome() + 
                               " " + giocatore_2.getCognome());
        } else {
            System.out.println("- Errore durante la simulazione -");
            return;
        }

        System.out.print("Simulazione set 2: ");
        winner = set_2.simulazione();
        if (winner == 0) {
            p_1++;
            System.out.println("vince " + giocatore_1.getNome() + " " + 
                               giocatore_1.getCognome());
        } else if (winner == 1) {
            p_2++;
            System.out.println("vince " + giocatore_2.getNome() + " " + 
                               giocatore_2.getCognome());
        } else {
            System.out.println("- Errore durante la simulazione -");
            return;
        }

        if (p_1 == 2) {
            System.out.println("Ha vinto la partita " + giocatore_1.getNome() + 
                               " " + giocatore_1.getCognome());
            System.out.println("Set 1: " + set_1.toString());
            System.out.println("Set 2: " + set_2.toString());
            return;
        } else if (p_2 == 2) {
            System.out.println("Ha vinto la partita " + giocatore_2.getNome() + 
                               " " + giocatore_2.getCognome());
            System.out.println("Set 1: " + set_1.toString());
            System.out.println("Set 2: " + set_2.toString());
            return;
        }

        System.out.print("Simulazione set 3: ");
        winner = set_3.simulazione();
        if (winner == 0) {
            p_1++;
            System.out.println("vince " + giocatore_1.getNome() + " " +
                               giocatore_1.getCognome());
        } else if (winner == 1) {
            p_2++;
            System.out.println("vince " + giocatore_2.getNome() + " " +
                               giocatore_2.getCognome());
        } else {
            System.out.println("- Errore durante la simulazione -");
            return;
        }

        if (p_1 == 2) {
            System.out.println("Ha vinto la partita " + giocatore_1.getNome() + 
                               " " + giocatore_1.getCognome());
            System.out.println("Set 1: " + set_1.toString());
            System.out.println("Set 2: " + set_2.toString());
            System.out.println("Set 3: " + set_3.toString());
        } else if (p_2 == 2) {
            System.out.println("Ha vinto la partita " + giocatore_2.getNome() + 
                               " " + giocatore_2.getCognome());
            System.out.println("Set 1: " + set_1.toString());
            System.out.println("Set 2: " + set_2.toString());
            System.out.println("Set 3: " + set_3.toString());
        }

    }

    public void setGiocatore1() {
        String in[];
        System.out.print("Inserisci dati Giocatore 1: ");
        in = scanner.nextLine().trim().split(" +");
        if (in.length != 3) {
            System.out.println("- Errore in input -");
            setGiocatore1();
            return;
        }
        try {
            giocatore_1 = new Giocatore(in[0], in[1], Integer.parseInt(in[2]));
        } catch (NumberFormatException e) {
            System.out.println("- Errore in input -");
            setGiocatore1();
        }
    }

    public void setGiocatore2() {
        String in[];
        System.out.print("Inserisci dati Giocatore 2: ");
        in = scanner.nextLine().trim().split(" +");
        if (in.length != 3) {
            System.out.println("- Errore in input -");
            setGiocatore2();
            return;
        }
        try {
            giocatore_2 = new Giocatore(in[0], in[1], Integer.parseInt(in[2]));
        } catch (NumberFormatException e) {
            System.out.println("- Errore in input -");
            setGiocatore2();
        }
    }

    public static void main(String args[]) {
        Incontro incontro = new Incontro();
        incontro.simulazione();
    }

}
