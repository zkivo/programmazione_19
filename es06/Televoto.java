package es06;

import java.util.ArrayList;
import java.util.Scanner;

public class Televoto {

    private static final int MAX_CANTANTI = 15;
    private ArrayList<Votante> votanti;
    private int voti_cantante[];

    public Televoto() {
        votanti = new ArrayList<Votante>();
        voti_cantante = new int[MAX_CANTANTI];
        for (int i = 0; i < MAX_CANTANTI; i++) {
            voti_cantante[i] = 0;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Televoto televoto = new Televoto();
        do {
            System.out.print("-- Menu' --\n" + 
                             "1) Inserisci voto\n" + 
                             "2) Stampa voti ricevuti\n" +
                             "3) Stampa voti per cantante\n" +
                             "4) Exit\n>>");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Inserisci numero di telefono\n>>");     
                    boolean flag = false;
                    long num_telefono = scanner.nextLong();
                    int num_cantante;
                    for (Votante v : televoto.votanti) {
                        if (v.getNumeroTelefono() == num_telefono) {
                            //Questo votante esiste
                            flag = true;
                            if (v.getCountVoti() >= Votante.MAX_VOTI) {
                                System.out.println("Questo utente non puo'" + 
                                                   "votare");
                                break;
                            } else {
                                System.out.print("Inserisci numero cantante\n" +
                                                 ">>");
                                num_cantante = scanner.nextInt();
                                if (num_cantante <= 0 || num_cantante > 
                                        MAX_CANTANTI) {
                                    System.out.println("Numero cantante " + 
                                                       "invalido");
                                    break;
                                }
                                v.vota(num_cantante);
                                televoto.voti_cantante[num_cantante - 1]++;
                            }
                            break;
                        }
                    }
                    if (!flag) {
                        Votante v = new Votante(num_telefono);
                        System.out.print("Inserisci numero di cantante\n>>");
                        num_cantante = scanner.nextInt();
                        if (num_cantante <= 0 || num_cantante > MAX_CANTANTI) {
                            System.out.println("Numero cantante " + 
                                                "invalido");
                            break;
                        }
                        v.vota(num_cantante);
                        televoto.voti_cantante[num_cantante - 1]++;
                        televoto.votanti.add(v);
                    }
                break;

                case 2:
                    int sum = 0;
                    for (Votante v: televoto.votanti) {
                        sum += v.getCountVoti();
                    }
                    System.out.println("Numero voti ricevuti: " + sum);
                break;

                case 3:
                    for (int i = 0 ; i < MAX_CANTANTI; i++) {
                        System.out.println((i + 1) + ": " + 
                                            televoto.voti_cantante[i] + 
                                            " voti");
                    }
                break;

                case 4:
                    return;
                
                default:
                    System.out.println("Input invalido");
            }

        } while(true);
    }
}