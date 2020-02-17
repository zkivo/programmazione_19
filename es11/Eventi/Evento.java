package es11.Eventi;

public abstract class Evento {

    private int    codice;
    private String descrizione;    

    public Evento(int codice, String descrizione) {
        this.codice = codice;
        setDescrizione(descrizione);
    }

    public String toString() {
        return "Codice: " + codice + ", Descrizione: " + descrizione;
    }

    public void setCodice(int codice) { 
        this.codice = codice;
    }    

    public void setDescrizione(String descrizione) {
        this.descrizione = new String(descrizione);
    }    

    public int getCodice() {
        return codice;
    }    

    public String getDescrizione() {
        return descrizione;
    }    

}
