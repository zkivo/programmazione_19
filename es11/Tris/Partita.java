package es11.Tris;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Partita {

    private Computer  computer;
    private Umano     player_1;
    private Umano     player_2;
    private List<Character> griglia;

    public Partita() {
        computer = new Computer('X');
        player_1 = new Umano('O', "Giocatore_1");
        player_2 = new Umano('X', "Giocatore_2");
        griglia  = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            griglia.add(' ');
        }
    }

    private void inizializzaGriglia() {
        for (int i = 0; i < 9; i++) {
            griglia.set(i, ' ');
        }
    }

    

    private void stampaGriglia() {
        int i = 0;
        System.out.println("  | A | B | C |");
        System.out.print("1 |");
        while (i < 3) System.out.print(" " + griglia.get(i++) + " |");
        System.out.print("\n2 |");
        while (i < 6) System.out.print(" " + griglia.get(i++) + " |");
        System.out.print("\n3 |");
        while (i < 9) System.out.print(" " + griglia.get(i++) + " |");
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner scanner  = new Scanner(System.in);
        Partita partita  = new Partita();
        boolean exit     = false;
        boolean piena    = false; 
        boolean w_play_1 = false;
        boolean w_play_2 = false;
        boolean w_comp   = false;
        int input;

        do {

            System.out.print("\n-- Menu' --\n" +
                             "1) Giocare contro il computer\n" +
                             "2) Giocare contro Giocatore_2\n" +
                             "3) Exit\n>>");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-- Input non valido --");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            partita.inizializzaGriglia();
            piena   = false;
            w_play_1 = false;
            w_play_2 = false;
            w_comp  = false;
            switch (input) {
                case 1:
                    try {
                        do {
                            partita.stampaGriglia();
                            if (!partita.player_1.gioca(partita.griglia)) {
                                piena    = true;
                                break;
                            }
                            if (partita.player_1.hasWon(partita.griglia)) {
                                w_play_1 = true;
                                break;
                            }
                            if (!partita.computer.gioca(partita.griglia)) {
                                piena    = true;
                                break;
                            }
                            if (partita.computer.hasWon(partita.griglia)) {
                                w_comp   = true;
                                break;
                            }

                        } while(true);
                        partita.stampaGriglia();
                        if (piena) {
                            if (partita.player_1.hasWon(partita.griglia)) {
                                System.out.println(
                                    "\n-- Ha vinto Giocatore_1! --");
                                partita.player_1.aumentaPunti();
                            } else if (partita.computer.hasWon(
                                    partita.griglia)) {
                                System.out.println(
                                    "\n-- Ha vinto il Computer! --");
                                partita.computer.aumentaPunti();
                            } else {
                                System.out.println("Parita'!");
                            }
                        } else {
                            if (w_play_1) {
                                System.out.println(
                                    "\n-- Ha vinto Giocatore_1! --");
                                partita.player_1.aumentaPunti();
                            } else if (w_comp) {
                                System.out.println(
                                    "\n-- Ha vinto il Computer! --");
                                partita.computer.aumentaPunti();
                            } else {
                                System.out.println("Parita'!");
                            }
                        }
                        System.out.println(partita.player_1.getNickname() + 
                                           " : " +  
                                           partita.player_1.getPunti() + 
                                           " punti/o\nComputer : " + 
                                           partita.player_2.getPunti() + 
                                           " punti/o");
                    } catch (MyTrisException e) {
                        e.printStackTrace();
                        System.out.println("-- Error -- " + e.getMessage());
                        break;
                    }
                break;
                case 2:
                    try {
                        do {
                            partita.stampaGriglia();
                            if (!partita.player_1.gioca(partita.griglia)) {
                                piena     = true;
                                break;
                            }
                            if (partita.player_1.hasWon(partita.griglia)) {
                                w_play_1  = true;
                                break;
                            }
                            partita.stampaGriglia();
                            if (!partita.player_2.gioca(partita.griglia)) {
                                piena     = true;
                                break;
                            }
                            if (partita.player_2.hasWon(partita.griglia)) {
                                w_play_2  = true;
                                break;
                            }

                        } while(true);
                        partita.stampaGriglia();
                        if (piena) {
                            if (partita.player_1.hasWon(partita.griglia)) {
                                System.out.println(
                                    "\n-- Ha vinto Giocatore_1! --");
                                partita.player_1.aumentaPunti();
                            } else if (partita.player_2.hasWon(
                                    partita.griglia)) {
                                System.out.println(
                                    "\n-- Ha vinto Giocatore_2! --");
                                partita.player_2.aumentaPunti();
                            } else {
                                System.out.println("Parita'!");
                            }
                        } else {
                            if (w_play_1) {
                                System.out.println(
                                    "\n-- Ha vinto Giocatore_1! --");
                                partita.player_1.aumentaPunti();
                            } else if (w_play_2) {
                                System.out.println(
                                    "\n-- Ha vinto il Computer! --");
                                partita.player_2.aumentaPunti();
                            } else {
                                System.out.println("Parita'!");
                            }
                        }
                        System.out.println(partita.player_1.getNickname() + 
                                           " : " + 
                                           partita.player_1.getPunti() + 
                                           " punti/o\n" + 
                                           partita.player_2.getNickname() + 
                                           " : " + 
                                           partita.computer.getPunti() + 
                                           " punti/o");
                    } catch (MyTrisException e) {
                        e.printStackTrace();
                        System.out.println("-- Error -- " + e.getMessage());
                        break;
                    }
                break;
                case 3:
                    exit = true;
                break;
                default:
                    System.out.println("-- Input non valido --");
                break;
            }

        } while(!exit);

    }

}
