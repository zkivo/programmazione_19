package es11.Museo;

public class Scultura extends OperaDArte{

    private String materiale;
    private double altezza;

    public Scultura() {
        super(null, null, null);
    }

    public Scultura(String titolo, String autore, String data_di_creazione) {
        super(titolo, autore, data_di_creazione);
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public String toString() {
        return "Titolo: " + getTitolo() + ", Autore: " + getAutore() +
               ", Data Di Creazione: " + getDataDiCreazione() +
               ", Materiale: " + materiale + ", Altezza: " + altezza;
    }

}
