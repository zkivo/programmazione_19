package es08;

public class Automobile extends VeicoloAMotore {

    private String targa;

    public Automobile() {
        this("", 0);
    }

    public Automobile(String targa, long cilindrata) {
        this.targa = new String(targa);
        setCilindrata(cilindrata);
    }

    public String getTarga() {
        return targa;
    }

}