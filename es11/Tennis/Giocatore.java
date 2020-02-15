package es11.Tennis;

public class Giocatore {

    private String nome;
    private String cognome;
    private int    posizione;

    public Giocatore(String nome, String cognome, int posizione) {
        this.nome      = new String(nome);
        this.cognome   = new String(cognome);
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getPosizione() {
        return posizione;
    }
}
