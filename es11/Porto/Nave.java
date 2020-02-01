package es11.Porto;

public class Nave implements Comparable<Nave> {

    private static int counter = 0;

    private String codice;
    private Vettore2D posizione;
    private int direzione;
    private double velocita;
    private double lunghezza;
    private double larghezza;

    public Nave(Vettore2D posizione, double velocita, int direzione, 
            double lunghezza, double larghezza) {
        setCodice((char)(Math.random() * 25 + 65) + String.valueOf(counter++));
        setPosizione(posizione);
        setVelocita(velocita);
        setDirezione(direzione);
        setLunghezza(lunghezza);
        setLarghezza(larghezza);
    }

    public int compareTo(Nave nave) {
        return getCodice().compareTo(nave.getCodice());
    }

    public void avanza() {
        posizione.setX(posizione.getX() + getVelocita() *
                            Math.cos(getDirezione()*3.14/180));
        posizione.setY(posizione.getY() + getVelocita() * 
                            Math.sin(getDirezione()*3.14/180));
    }

    public String toString() {
        return "Codice: " + codice + ", Posizione: " + posizione +
                ", Velocita: "  + velocita  + ", Direzione: " + direzione +
                ", Lunghezza: " + lunghezza + ", Larghezza: " + larghezza;    
    }

    public String getCodice() {
        return codice;
    }

    public Vettore2D getPosizione() {
        return posizione;
    }

    public void setCodice(String codice) {
        this.codice = new String(codice);
    }

    public void setPosizione(Vettore2D posizione) {
        this.posizione = new Vettore2D(posizione);
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public void setDirezione(int direzione) {
        this.direzione = direzione;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getVelocita() {
        return velocita;
    }

    public int getDirezione() {
        return direzione;
    }

}
