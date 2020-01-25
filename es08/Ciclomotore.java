package es08;

public class Ciclomotore extends VeicoloAMotore {

    private long numero_telaio;

    public Ciclomotore() {
        this(0);
    }

    public Ciclomotore(long numero_telaio) {
        this.numero_telaio = numero_telaio;
        setCilindrata(50);
    }

    public long getNumeroTelaio() {
        return numero_telaio;
    }

}