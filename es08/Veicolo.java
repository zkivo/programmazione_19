package es08;

public abstract class Veicolo {

    private Vettore2D posizione;
    private Vettore2D velocita_iniziale;
    private Vettore2D accelerazione;

    public Veicolo() {
        posizione         = new Vettore2D();
        accelerazione     = new Vettore2D();
        velocita_iniziale = new Vettore2D();
    }

    public Vettore2D muovi(double t) {
        posizione.setX(posizione.getX() + velocita_iniziale.getX() * t +
                       accelerazione.getX() * t * t);
        posizione.setY(posizione.getY() + velocita_iniziale.getY() * t +
                       accelerazione.getY() * t * t);
        return posizione;
    }

    public void setPosizione(double x, double y) {
        posizione.setX(x);
        posizione.setY(y);
    }

    public void setVelocitaIniziale(double x, double y) {
        velocita_iniziale.setX(x);
        velocita_iniziale.setY(y);
    }

    public void setAccelerazione(double x, double y) {
        accelerazione.setX(x);
        accelerazione.setY(y);
    }

    public String toString() {
        return "posizione: "  + posizione.toString() +
               " velocita iniziale: " + velocita_iniziale.toString() + 
               " accelerazione: " + accelerazione.toString();
    }

}