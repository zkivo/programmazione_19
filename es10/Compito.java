package es10;

public class Compito implements Comparable<Compito> {

    private int    priorita;
    private String descrizione;

    public Compito(int priorita, String descrizione) {
        this.priorita = priorita;
        this.descrizione = new String(descrizione);
    }

    public String toString() {
        return "Priorita': " + priorita + " - Descrizione: " + descrizione;
    }

    public int compareTo(Compito o) {
        if (priorita > o.priorita) return 1;
        else if (priorita < o.priorita) return -1;
        else return 0;
    }

}
