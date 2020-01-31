package es11.Museo;

public class Dipinto extends OperaDArte {

    private String tecnica;
    private String dimensioni;

    public Dipinto() {
        super(null, null, null);
    }

    public Dipinto(String titolo, String autore, String data_di_creazione) {
        super(titolo, autore, data_di_creazione);
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public String toString() {
        return "Titolo: " + getTitolo() + ", Autore: " + getAutore() +
               ", Data Di Creazione: " + getDataDiCreazione() +
               ", Tecnica: " + tecnica + ", Dimensioni: " + dimensioni;
    }

}
