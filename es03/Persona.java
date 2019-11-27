package es03;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {
        setNome("sconosciuto").setCognome("sconosciuto").setEta(-1);
    }

    public Persona(String nome, String cognome, int eta) {
        setNome(nome).setCognome(cognome).setEta(eta);
    }

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

    public String getNome() {
        return this.nome;
    }

    public boolean equals(Persona persona) {
        if (this.nome.equals(persona.nome) &&
            this.cognome.equals(persona.cognome) &&
            this.eta == persona.eta) return true;
        else return false;
    }

    public String toString(){
        return nome + " " + cognome + " " + eta; 
    }
}