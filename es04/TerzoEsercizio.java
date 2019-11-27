package es04;

import es03.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class TerzoEsercizio {

    public static void main(String args[]) {
        ArrayList<Persona> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.print("-- Menu --\n(I)nserire persona\n" + 
                             "(C)ercare persona\n" + 
                             "(S)tampare lista\n" + 
                             "(E)liminare lista\n" + 
                             "(F)ine\n>>");
            switch (scanner.next().toUpperCase()) {
                case "I":
                    System.out.print("Inserire nome, cognome ed eta'\n>>");
                    lista.add(new Persona(scanner.next(), scanner.next(), scanner.nextInt()));
                break;

                case "C":
                    System.out.print("Inserire il nome della persona da cercare\n>>");
                    String temp = scanner.next();
                    for (Persona p : lista) {
                        if (p.getNome().equals(temp)) {
                            System.out.println("Trovata la persona: " + p);
                        }
                    }
                break;

                case "S":
                    System.out.println(lista);
                break;

                case "E":
                    lista.clear();
                break;

                case "F":
                    return;

                default:
                    System.out.println("--Errore--\n" + 
                                       "Inserire una delle lettere indicate nel menu'.\n");
            }
        }
    }

}