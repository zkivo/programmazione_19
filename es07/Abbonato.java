package es07;

public class Abbonato extends Persona {

    private float sconto;

    public Abbonato(String nome, String cognome, float sconto) {
        setNome(nome);
        setCognome(cognome);
        this.sconto = sconto;    
    }

    public void setSconto(float sconto) {
        this.sconto = sconto;
    }

    public float getSconto() {
        return sconto;
    }

}