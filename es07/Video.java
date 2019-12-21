package es07;

public class Video {

    private String titolo;
    private float prezzo;

    public Video(String titolo, float prezzo) {
        this.titolo   = titolo;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public float getPrezzo() {
        return prezzo;
    }

}