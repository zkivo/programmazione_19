package es05;

import java.util.ArrayList;
import java.util.Scanner;
import es04.Studente;
import es04.Date;

public class Archivio {

    ArrayList<Studente> archivio;
    ArrayList<Studente> esame;

    public Archivio() {
        archivio = new ArrayList<Studente>();
        esame = new ArrayList<Studente>();
    }

    public void insertToArchive(Studente s) {
        archivio.add(s);
    }

    public Studente searchArchiveByMatricola(long matricola) {
        for (Studente s : archivio) {
            if (s.getMatricola() == matricola) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Studente> searchArchiveByLastName(String cognome) {
        ArrayList<Studente> ret = new ArrayList<Studente>();
        for (Studente s: archivio) {
            if (s.getCognome().toUpperCase().equals(cognome.toUpperCase()))
                ret.add(s);
        }
        return ret;
    }

    public void insertToEsame(long matricola) {
        for (Studente s : archivio) {
            if (s.getMatricola() == matricola)
                if (!esame.contains(s)) 
                    esame.add(s);
        }
    }

    public Studente removeFromEsame(long matricola) {
        for (int i = 0; i < esame.size(); i++) {
            if (esame.get(i).getMatricola() == matricola) {
                return esame.remove(i);
            }
        }
        return null;
    }

    public void printEsame() {
        System.out.println("-- Iscritti all'esame --");
        System.out.println(esame);
    }

    public void clearEsame() {
        esame.clear();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Archivio archivio = new Archivio();
        do {
            System.out.println("--- Menu ---");
            System.out.print("1) Inserire studente in archivio\n" + 
                             "2) Cercare in archivio per matricola\n" + 
                             "3) Cercare in archivio per cognome\n" + 
                             "4) Iscrivere studente all'esame\n" +
                             "5) Rimuovere studente dall'esame\n" + 
                             "6) Stampare lista iscritti all'esame\n" +
                             "7) Cancellare lista iscritti all'esame\n" +
                             "8) Esci\n>>");
            switch (scanner.nextInt()) {
                case 1:
                    String nome, cognome;
                    Date date;
                    System.out.print("Inserire nome e cognome\n>>");
                    nome    = scanner.next();
                    cognome = scanner.next();
                    System.out.print("Inserire data di nasciata (gg/mm/aaaa)\n>>");
                    date = new Date(scanner.nextInt(), scanner.nextInt(),
                                    scanner.nextInt());
                    archivio.insertToArchive(new Studente(nome, cognome, date));
                break;

                case 2:
                    System.out.print("Inserire matricola\n>>");
                    System.out.println(
                        archivio.searchArchiveByMatricola(scanner.nextLong()));
                break;
            
                case 3:
                    System.out.print("Inserire cognome\n>>");
                    System.out.println(
                        archivio.searchArchiveByLastName(scanner.next()));
                break;

                case 4:
                    System.out.print("Inserire matricola\n>>");
                    archivio.insertToEsame(scanner.nextLong());
                break;

                case 5:
                    System.out.print("Inserire matricola\n>>");
                    System.out.println(
                        archivio.removeFromEsame(scanner.nextLong()));
                break;

                case 6:
                    archivio.printEsame();
                break;

                case 7:
                    archivio.clearEsame();
                break;

                case 8:
                    return;
                
                default:
                    System.out.println("-- Input errato --");
            } 

        } while(true);
    }

}