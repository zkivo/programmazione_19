package es11.Seggio;

public class Candidato extends Studente {

    private String lista;

    public Candidato(String nome, String cognome, long matricola,
            long codice_controllo, String lista) {
        super(nome, cognome, matricola, codice_controllo);
        setLista(lista);
    }

    public String toString() {
        return super.toString() + ", Lista: " + lista;
    }

    public String getLisa();

    public void setLista(String lista) {
        lista = new String(lista);
    }

}
