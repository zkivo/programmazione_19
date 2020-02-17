package es11.Eventi;

public class EventoMouse extends Evento {

    private int x;
    private int y;
    private int stato;

    public EventoMouse(int cod, String desc, int x, int y, int s) {
        super(cod, desc);
        this.x     = x;
        this.y     = y;
        this.stato = s;
    }

    public String toString() {
        return "EventoMouse; " + super.toString() + ", X: " + x + 
               ", Y: " + y + ", Stato pressione: " + stato;
    }

}
