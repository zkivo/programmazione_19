package es11.Seggio;

import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Collections;

public class Seggio {

    private Set<Studente>           set_studenti;
    private Set<Candidato>          set_candidati;
    private List<Candidato>         list_candidati;
    private Map<Studente, Boolean>  has_voted;
    private Map<Candidato, Integer> num_voti;

    public Seggio() {
        set_studenti  = new HashSet<>();
        set_candidati = new HashSet<>();
        has_voted     = new TreeMap<>();
        num_voti      = new TreeMap<>();
        set_candidati.add(new Candidato("Mario", 
                                        "Rossi",
                                        123, 321,
                                        "Destra"));
        set_candidati.add(new Candidato("Luca",
                                        "Neri",
                                        234, 432,
                                        "Destra"));
        set_candidati.add(new Candidato("Giuseppe",
                                        "Musso",
                                        345, 543,
                                        "Sinistra"));
        set_studenti.add(new Studente("Maria",
                                      "Neri",
                                      456, 654));
        set_studenti.add(new Studente("Andrea",
                                      "Ferrero",
                                      567,765));
        set_studenti.add(new Studente("Francesco",
                                      "Bianchi",
                                      678,876));
        set_studenti.add(new Studente("Fabio",
                                      "Gamba",
                                      789,987));
        set_studenti.add(new Studente("Paola",
                                      "Penna",
                                      890,98));
        
    }

    private void updateListCandidati() {
        if (list_candidati != null) {
            if (list_candidati.size() == set_candidati.size()) {
                return;
            }
        }
        list_candidati = Arrays.asList(
                            set_candidati.toArray(new Candidato[0]));
        Candidato c;
        Collections.sort(list_candidati);
    }

    public void printListaCandidati() {
        System.out.println("Lista candidati:");
        updateListCandidati();
        Candidato c;
        for (int i = 0; i < list_candidati.size(); i++) {
            c = list_candidati.get(i);
            System.out.println((i + 1) + ") " + c.getNome() + " " + 
                               c.getCognome() + " - " + c.getLista()); 
        }
    }

    public void printResults() {
        Set<String>    list_type  = new HashSet<>();
        Set<Candidato> set_chiavi = num_voti.keySet();
        for (Candidato candidato : set_candidati) {
            list_type.add(candidato.getLista());
        }
        for (String str : list_type) {
            System.out.println("Lista \"" + str + "\":"); 
            for (Candidato candidato : set_chiavi) {
                if (candidato.getLista().equals(str)) {
                    System.out.println(candidato.getNome() + " " +
                                       candidato.getCognome() + ": " +
                                       num_voti.get(candidato) + " voto/i");
                }
            }
        }
    }

    public Set<Studente> getSetStudenti() {
        return set_studenti;
    }

    public static void main(String args[]) {
        
        Scanner scanner  = new Scanner(System.in);
        Seggio  seggio   = new Seggio();
        Candidato cand   = null;
        boolean exit     = false;
        boolean flag     = false;
        boolean flag_2   = false;
        boolean flag_3   = false;
        long matricola   = 0;
        long codice_ctr  = 0;
        int  input       = 0;


        do {
            if (seggio.has_voted.size() >= seggio.set_studenti.size() + 
                    seggio.set_candidati.size()) {
                System.out.println("-- Ogni studente ha votato --");
                break;
            }

            System.out.print("-- Menu' --\n" +
                             "1) Inserisci voto\n" +
                             "2) Stampa risultati\n" + 
                             "3) Exit\n>>");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-- Errore in input --");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            
            switch (input) {
                case 1:
                    try {            
                        flag   = false;    
                        flag_2 = false;    
                        flag_3 = false;
                        System.out.print("Inserire matricola: ");
                        matricola = Long.parseLong(scanner.nextLine());
                        System.out.print("Inserire codice di controllo: ");
                        codice_ctr = Long.parseLong(scanner.nextLine());
                        for (Candidato c : seggio.set_candidati) {
                            if (c.getMatricola() != matricola || 
                                    c.getCodiceControllo() != codice_ctr) {
                                continue;
                            }
                            if (seggio.has_voted.get(c) != null) {
                                flag_3 = true;
                                break;
                            }
                            flag = true;
                            seggio.printListaCandidati();
                            System.out.print("Votare candidato di indice" + 
                                             "(inserire 0 per scheda " + 
                                             "bianca): ");
                            input = Integer.parseInt(scanner.nextLine());
                            seggio.has_voted.put(c, true);
                            seggio.updateListCandidati();
                            if (input >= 0 && input <= 
                                    seggio.set_candidati.size()) {
                                if (input != 0) {
                                    c = seggio.list_candidati.get(input - 1);
                                    if (seggio.num_voti.get(c) != null) {
                                        seggio.num_voti.put(c, 
                                                seggio.num_voti.get(c) + 1);
                                        break;
                                    }
                                    seggio.num_voti.put(c, 1);
                                }
                                break;
                            }
                        }
                        if (!flag) {
                            for (Studente s : seggio.set_studenti) {
                                if (s.getMatricola() != matricola || 
                                        s.getCodiceControllo() != codice_ctr) {
                                    continue;
                                }
                                if (seggio.has_voted.get(s) != null) {
                                    flag_3 = true;
                                    break;
                                }
                                flag_2 = true;
                                seggio.printListaCandidati();
                                System.out.print("Votare candidato di indice" + 
                                                 "(inserire 0 per scheda " + 
                                                 "bianca): ");
                                input = Integer.parseInt(scanner.nextLine());
                                seggio.has_voted.put(s, true);
                                seggio.updateListCandidati();
                                if (input >= 0 && input <= 
                                        seggio.set_candidati.size()) {
                                    if (input != 0) {
                                        cand = seggio.list_candidati.get(input 
                                                                         - 1);
                                        if (seggio.num_voti.get(cand) != null) {
                                            seggio.num_voti.put(cand, 
                                                seggio.num_voti.get(cand) + 1);
                                            break;
                                        }
                                        seggio.num_voti.put(cand, 1);
                                    }
                                    break;
                                }
                            }
                        }
                        if (flag_3) {
                            System.out.println("Questo studente ha gia' " +
                                               "votato.");
                            continue;
                        }
                        if (flag_2 == false && flag == false) {
                            System.out.println("Matricola o codice di " +
                                               "accesso errato.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("-- Errore in input --");
                        continue;
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                break;

                case 2:
                    seggio.printResults();
                break;

                case 3:
                    exit = true;
                break;

                default:
                    System.out.println("-- Errore in input --");
                break;
            }

        } while(!exit);
        seggio.printResults();
    }

}
