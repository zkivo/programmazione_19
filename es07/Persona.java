package es07;

import es04.Date;

public class Persona {

    private Date dataDiNascita;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String indirizzo;
    private String citta;
    private String cap;

    public String getNominativo() {
        return nome + " " + cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }


}