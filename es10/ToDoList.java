package es10;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Queue<Compito> coda = new PriorityQueue<>();
        int    input;
        String desc;
        boolean flag = true;
        
        do {
            System.out.print("-- Menu' --\n" +
                             "1) Aggiungi compito\n" +
                             "2) Next\n" + 
                             "3) Exit\n>>");
            input = scanner.nextInt();
            

            switch (input) {
                case 1:
                    System.out.print("Inserisci priorita' :");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci descrizione: ");
                    desc = scanner.nextLine();
                    coda.offer(new Compito(input, desc));
                break;
                case 2:
                    coda.poll();
                break;

                case 3:
                    flag = false;
                break;
            }
            
            System.out.println(coda);

        } while (flag);
    }
}
