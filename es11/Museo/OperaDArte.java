package es11.Museo;


public abstract class OperaDArte 
        implements Comparable<OperaDArte> {

    private String titolo;
    private String autore;
    private String data_di_creazione;

    public OperaDArte(String titolo, 
                      String autore, 
                      String data_di_creazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.data_di_creazione = data_di_creazione;
    }

    public int compareTo(OperaDArte opera) {
        return titolo.compareTo(opera.titolo);
    }

    public void setDataDiCreazione(String ddc) {
        this.data_di_creazione = ddc;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataDiCreazione() {
        return data_di_creazione;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract String toString();

}
