package es08;

public class Bicicletta extends Veicolo {

    private String modello;

    public Bicicletta() {
        this("");
    }

    public Bicicletta(String modello) {
        this.modello = new String(modello);
    }

    public String getModello() {
        return modello;
    }

}