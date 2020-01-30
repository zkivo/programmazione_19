package es10;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();

        String   input;
        String[] parola;

        boolean exit = false;

        do {

            System.out.print("Inserisci parola: ");
            input = scanner.nextLine().trim();
            if (input.equals("")) continue;

            parola = input.replaceAll("\\h+", " ").split(" ");

            for (int i = 0; i < parola.length; i++) {
                if (parola[i].contains(".")) {
                    deque.offerFirst(parola[i].substring(0, 
                                               parola[i].indexOf(".") + 1));
                    exit = true;
                    break;
                }
                deque.offerFirst(parola[i]);
            }

        } while (!exit);

        for (int i = deque.size() - 1; i >= 0; i--) {
            System.out.print(deque.pollFirst() + " ");
        }

        System.out.println();
    }
}
