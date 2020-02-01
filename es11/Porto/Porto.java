package es11.Porto;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;

public class Porto {

    private static final double MAX_DISTANZA = 2;
    private List<Nave> lista;

    public Porto() {
        setLista(new ArrayList<Nave>());
    }

    public void setLista(ArrayList<Nave> array) {
        lista = array;
    }

    public List<Nave> getLista() {
        return lista;
    }
    
    public void avanzareNavi() {
        for (Nave nave : lista) {
            nave.avanza();
        }
    }

    public boolean insertNatante(Nave nave) {
        return lista.add(nave);
    }

    public boolean removeNatante(String codice) {
        for (Nave nave : lista) {
            if (nave.getCodice().equals(codice)) {
                return lista.remove(nave);
            }
        }
        return false;
    }

    public static void main(String args[]) {

        Porto porto     = new Porto();
        Scanner scanner = new Scanner(System.in);
        List<String> collisioni;
        Nave    nave;
        int     input     = 0;
        int     direzione = 0;
        double  x         = 0;
        double  y         = 0;        
        double  lunghezza = 0;
        double  larghezza = 0;
        double  velocita  = 0;
        boolean exit = false;

        do {

            System.out.print("\n-- Menu' --\n" +
                             "1) Inserire nave\n" +
                             "2) Rimuovere nave\n" +
                             "3) Avanzare natanti\n" +
                             "4) Stampa stato navi\n" + 
                             "5) Verifica collisioni\n" +
                             "6) Exit\n>>");
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("-- Errore in input --");
                scanner.nextLine();
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                scanner.nextLine();
                continue;
            }
         
            scanner.nextLine();

            switch (input) {

                case 1:
                    try {
                        System.out.print("Inserire coordinata x: ");
                        x = Double.parseDouble(scanner.nextLine());
                        System.out.print("Inserire coordinata y: ");
                        y = Double.parseDouble(scanner.nextLine());
                        System.out.print("Inserire velocita: ");
                        velocita = Double.parseDouble(scanner.nextLine());
                        System.out.print("Inserire direzione: ");
                        direzione = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Inserire lunghezza: ");
                        lunghezza = Double.parseDouble(scanner.nextLine());
                        System.out.print("Inserire larghezza: ");
                        larghezza = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("-- Errore in input --");
                        continue;
                    } catch (InputMismatchException e) {
                        System.out.println("-- Errore in input --");
                        scanner.nextLine();
                        continue;
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                    nave = new Nave(new Vettore2D(x, y), velocita, direzione,
                                    lunghezza, larghezza);
                    porto.insertNatante(nave);
                break;

                case 2:
                    System.out.print("Inserire codice nave: ");
                    System.out.println((porto.removeNatante(scanner.nextLine()))? 
                                  "Natente rimosso." : "Natante non trovato.");
                break;

                case 3:
                    porto.avanzareNavi();
                break;

                case 4:
                    Collections.sort(porto.getLista());
                    System.out.println("\nLista navi:");
                    for (Nave n : porto.getLista()) {
                        System.out.println(n);
                    }
                break;

                case 5:
                    System.out.println("\nLista potenziali collisioni:");
                    collisioni = porto.detectCollisions();
                    Collections.sort(collisioni);
                    for (String s : collisioni) {
                        System.out.println(s);
                    }
                break;

                case 6:
                    exit = true;
                break;

                default:
                    System.out.println("-- Errore in input --");
                break;
            }

        } while(!exit);

    }

    public List<String> detectCollisions() {
        return detectCollisions(Porto.MAX_DISTANZA);
    }

    public List<String> detectCollisions(double max_distanza) {
        List<String> ret = new ArrayList<>();
        Nave nave_1;
        Nave nave_2;
        double dx;
        double dy;        
        int i;
        int j;        
        for (i = 0; i < lista.size(); i++) {
            for (j = i + 1; j < lista.size(); j++) {
                nave_1 = lista.get(i);
                nave_2 = lista.get(j);
                dx = nave_1.getPosizione().getX() - 
                        nave_2.getPosizione().getX();
                dy = nave_1.getPosizione().getY() -
                        nave_2.getPosizione().getY();
                if (Math.sqrt(dx * dx + dy * dy) <= max_distanza)
                    ret.add(nave_1.getCodice() + " - " + nave_2.getCodice());
            }
        }
        if (ret.size() == 0) ret.add("Nessuna potenziale collisione trovata.");
        return ret;
    }

}
