package es07;

import java.util.List;
import java.util.ArrayList;

public class Videoteca {

    private List<Abbonato> abbonati;
    private List<Oggetto>  oggetti;

    public Videoteca() {
        abbonati = new ArrayList<>();
        oggetti  = new ArrayList<>();
        // lista oggetti di default
        oggetti.add(new Oggetto("Star wars", 30f));
        oggetti.add(new Oggetto("Lord of the rings", 30f));
        oggetti.add(new Oggetto("Forrest Gump", 25.99f));
        oggetti.add(new Oggetto("Your name", 9.99f));
    }

    public void aggiungiAbbonato(Abbonato abbonato) {
        abbonati.add(abbonato);
    }

    public float getPrezzo(float prezzo, Abbonato abbonato) {
        return prezzo * abbonato.getSconto();
    }

    public static void main(String args[]) {
        Videoteca videoteca = new Videoteca();
        videoteca.aggiungiAbbonato(new Abbonato("Mario", 
                                                "Rossi",
                                                0.75f));
        videoteca.aggiungiAbbonato(new Abbonato("Luca", 
                                                "Bianchi",
                                                0.5f));    
        videoteca.aggiungiAbbonato(new AbbonatoPremium(
                                   "Maria", "Verdi", 0.75f,
                                   true));
        videoteca.aggiungiAbbonato(new AbbonatoPremium(
                                   "Giovanni", "Rossi", 0.22f,
                                   false));

        for (int i = 0; i < 3; i++) {
            int i_abb = (int) (Math.random() * 4);
            int i_ogg = (int) (Math.random() * 4);


        }

    }

}