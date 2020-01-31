package es11.Museo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;

public class Museo {

    private String nome;
    private String indirizzo;
    private List<OperaDArte> elenco;

    public Museo(String nome, String indirizzo) {
        this.nome = new String(nome);
        this.indirizzo = new String(indirizzo);
        elenco = new ArrayList<>();
    }

    public boolean insertOpera(OperaDArte opera) {
        return elenco.add(opera);
    }

    public boolean removeOpera(OperaDArte opera) {
        return elenco.remove(opera);
    }

    public OperaDArte getOpera(String titolo) {
        for (OperaDArte opera : elenco) {
            if (opera.getTitolo().equals(titolo)) 
                return opera;
        }
        return null;
    }

    private static void insertOperaDetails(Scanner scanner, OperaDArte opera) {
        System.out.print("\t\tInserire titolo: ");
        opera.setTitolo(scanner.nextLine());
        System.out.print("\t\tInserire autore: ");
        opera.setAutore(scanner.nextLine());
        System.out.print("\t\tInserire data di creazione: ");
        opera.setDataDiCreazione(scanner.nextLine());
    }

    public static void main(String args[]) {
        
        Museo museo = new Museo("Museo di Palermo",
                                "Via Cavour 269");        
        Scanner    scanner = new Scanner(System.in);
        OperaDArte opera;
        boolean    exit = false;
        Dipinto    dipinto;
        Scultura   scultura;
        String str = null;
        int input;

        do {
            System.out.print("\n-- Menu' - " + museo.nome + " " +
                             museo.indirizzo + " --\n" +
                             "1) Inserire opera d'arte\n" +
                             "2) Stampare opere d'arte\n" +
                             "3) Rimuovere in base al titolo\n" +
                             "4) Stampare dettagli opera\n" + 
                             "5) Exit\n>>");
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
                    System.out.print("\t(D)ipinto o (S)cultura?\n\t>>");
                    str = scanner.nextLine();
                    if (str.toUpperCase().equals("D")) {
                        dipinto = new Dipinto();
                        insertOperaDetails(scanner, dipinto);
                        System.out.print("\t\tInserire tecnica: ");
                        dipinto.setTecnica(scanner.nextLine());
                        System.out.print("\t\tInserire dimensioni: ");
                        dipinto.setDimensioni(scanner.nextLine());
                        museo.insertOpera(dipinto);

                    } else if (str.toUpperCase().equals("S")) {
                        scultura = new Scultura();
                        insertOperaDetails(scanner, scultura);
                        System.out.print("\t\tInserire materiale: ");
                        scultura.setMateriale(scanner.nextLine());
                        System.out.print("\t\tInserire altezza: ");
                        str = scanner.nextLine();                        
                        try {
                            scultura.setAltezza(Double.parseDouble(str));
                        } catch (Exception e) {
                            System.out.println("-- Errore in input --");
                            continue;
                        }
                        museo.insertOpera(scultura);
                    } else {
                        System.out.println("-- Errore in input --");
                        continue;
                    }
                break;
            
                case 2:
                    museo.stampaElenco();
                break;

                case 3:
                    System.out.print("\tInserire titolo: ");
                    try {
                        museo.removeOpera(museo.getOpera(scanner.nextLine()));
                    } catch (NullPointerException e) {
                        System.out.println("\t-- Errore -- Nessun opera " +
                                           "trovata con questo titolo.");
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                break;

                case 4:
                    System.out.print("\tInserire titolo: ");
                    opera = museo.getOpera(scanner.nextLine());
                    if (opera == null) {
                        System.out.println("\t-- Errore -- Nessun opera " +
                                           "trovata con questo titolo.");
                        continue;
                    }
                    if (opera instanceof Dipinto) {
                        dipinto = new Dipinto(opera.getTitolo(),
                                              opera.getAutore(),
                                              opera.getDataDiCreazione());                    
                        System.out.println("\t\t" + dipinto);
                        continue;
                    }
                    scultura = new Scultura(opera.getTitolo(),
                                            opera.getAutore(),
                                            opera.getDataDiCreazione());   
                    System.out.println("\t\t" + scultura);
                break;

                case 5:
                    exit = true;
                break;
            
                default:
                    System.out.println("-- Errore in input --");
                break;
            }

        } while (!exit);
    }

    public void stampaElenco() {
        System.out.println("\nElenco opere d'arte.");
        Collections.sort(elenco);
        for (OperaDArte opera : elenco) {
            System.out.println(opera);
        }
    }

}
