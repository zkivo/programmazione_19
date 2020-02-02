package es11.Seggio;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.TreeMap;

public class Seggio {

    private Set<Studente>           set_studenti;
    private Set<Candidato>          set_candidati;
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
                                      890,098));
        
    }

    public void printListaCandidati() {
        System.out.println("Lista candidati:");
        List<Candidato> lista = Arrays.asList(
                                    set_candidati.toArray(new Candidato[0]));
        Candidato c;
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            c = lista.get(i);
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
                                       num_voti.get(candidato));
                }
            }
        }
    }

    public Set<Studente> getSetStudenti() {
        return set_studenti;
    }

    public static void main(String args[]) {
        
        Scanenr scanner  = new Scanner(System.in);
        Seggio  seggio   = new Seggio();
        boolean exit     = false;
        long matricola   = 0;
        long codice_ctr  = 0;
        int  input       = 0;


        do {
            if (has_voted.size() >= set_studenti.size() + 
                    set_candidati.size()) {
                System.out.println("-- Ogni studente ha votato --");
                seggio.printResults();
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
                        System.out.print("Inserire matricola: ");
                        matricola = Long.parseLong(scanner.nextLine());
                        System.out.print("Inserire codice di controllo: ");
                        codice_ctr = Long.parseLong(scanner.nextLine());
                        for (Candidato c : set_candidati) {
                            if (c.getMatricola() != matricola || 
                                    c.getCodiceControllo() != codice_ctr) {
                                continue;
                            }
                            seggio.printListaCandidati();

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
