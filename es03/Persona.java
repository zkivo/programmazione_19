package es03;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Persona setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }

    public Persona setEta(int eta) {
        this.eta = eta;
        return this;
    }

    public String toString(){
        return nome + " " + cognome + " " + eta; 
    }
}