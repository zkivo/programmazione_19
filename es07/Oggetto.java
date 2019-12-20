package es07;

public class Oggetto {

    private String nome;
    private float costo;

    public Oggetto(String nome, float costo) {
        this.nome  = nome;
        this.costo = costo;
    }

    public String getNome() {
        return nome;
    }

    public float getCosto() {
        return costo;
    }

}