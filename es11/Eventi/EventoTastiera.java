package es11.Eventi;

public class EventoTastiera extends Evento {

    private int cod_tasto;
    private int stat_mod;

    public EventoTastiera(int cod, String desc, int c, int s) {
        super(cod, desc);        
        cod_tasto = c;
        stat_mod  = s;
    }

    public String toString() {
        return "EventoTastiera; " + super.toString() + ", codice tasto: " +
               cod_tasto + ", Stato modificatori: " + stat_mod;
    }    

}
