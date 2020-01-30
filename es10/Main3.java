package es10;

import java.util.regex.Pattern;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> mappa = new TreeMap<>();    
        String nome;
        String voto;
        String input;
        boolean flag = true;
        do {
            System.out.print("-- Menu' --\n" +
                             "1) Inserire voto studente\n" +
                             "2) Modificare voto studente\n" +
                             "3) Stampa voti e studenti\n" +
                             "4) Exit\n>>");
            input = scanner.next();
            if (!scanner.nextLine().equals("")) {
                System.out.println("-- Input non valido --");
                continue;
            }
            switch (input) {
                case "1":
                case "2":
                    System.out.print("Inserire nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Inserire voto: ");
                    voto = scanner.next();
                    mappa.put(nome, voto);
                break;

                case "3":
                    System.out.println(mappa);
                break;

                case "4":
                    flag = false;
                break;

                default:
                    System.out.println("-- Input non valido --");
                break;
            } 
        } while (flag);
    }
}
